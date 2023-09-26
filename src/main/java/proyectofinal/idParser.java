// Generated from c:\Users\Usuario\Desktop\FACULTAD\Finales\TC\proyectofinal\src\main\java\proyectofinal\id.g4 by ANTLR 4.9.2

  package proyectofinal;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LLAVEA=2, LLAVEC=3, PARENTESISA=4, PARENTESISC=5, PUNTOCOMA=6, COMA=7, 
		INT=8, FLOAT=9, DOUBLE=10, CHAR=11, VOID=12, SUMA=13, RESTA=14, MULTIPLICACION=15, 
		DIVISION=16, EQ=17, IFF=18, IWHILE=19, IFOR=20, PALABRA=21, FLOAT_VARIABLE=22, 
		COMP=23, OPERADORLOGICO=24, ITERACIONSUMA=25, ITERACIONRESTA=26, COMILLA=27, 
		PUNTO=28, OTRO=29;
	public static final int
		RULE_s = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_types = 4, RULE_typesFunciones = 5, RULE_permutacion_variables = 6, 
		RULE_permutacion_variable_validar_tipo = 7, RULE_iif = 8, RULE_operacionaritlogicas_variable = 9, 
		RULE_operacionaritlogicas_comparacion = 10, RULE_operacionesaritlogicas = 11, 
		RULE_iwhile = 12, RULE_ifor = 13, RULE_ifor_iteracion = 14, RULE_declaracion = 15, 
		RULE_declarar = 16, RULE_declararAsignacion = 17, RULE_declararSinAsignacion = 18, 
		RULE_asignacion = 19, RULE_operaciones = 20, RULE_operadoresNumericos = 21, 
		RULE_declaracionFuncion_Nombre = 22, RULE_declaracionFuncion = 23, RULE_parametrosDeclaracionConcatenados = 24, 
		RULE_declaracionFuncion_parametros = 25, RULE_llamadaFuncion = 26, RULE_parametrosLlamadaFuncion = 27, 
		RULE_parametrosConcatenados = 28, RULE_definicionFuncion_parametro_nombre = 29, 
		RULE_definicionFuncion_Nombre = 30, RULE_defincionFuncion_parametros_global_rule = 31, 
		RULE_definicionFuncion_parametros_internal_rule = 32, RULE_defincionFuncion = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instrucciones", "instruccion", "bloque", "types", "typesFunciones", 
			"permutacion_variables", "permutacion_variable_validar_tipo", "iif", 
			"operacionaritlogicas_variable", "operacionaritlogicas_comparacion", 
			"operacionesaritlogicas", "iwhile", "ifor", "ifor_iteracion", "declaracion", 
			"declarar", "declararAsignacion", "declararSinAsignacion", "asignacion", 
			"operaciones", "operadoresNumericos", "declaracionFuncion_Nombre", "declaracionFuncion", 
			"parametrosDeclaracionConcatenados", "declaracionFuncion_parametros", 
			"llamadaFuncion", "parametrosLlamadaFuncion", "parametrosConcatenados", 
			"definicionFuncion_parametro_nombre", "definicionFuncion_Nombre", "defincionFuncion_parametros_global_rule", 
			"definicionFuncion_parametros_internal_rule", "defincionFuncion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'('", "')'", "';'", "','", "'int'", "'float'", 
			"'double'", "'char'", "'void'", "'+'", "'-'", "'*'", "'/'", "'='", "'if'", 
			"'while'", "'for'", null, null, null, null, "'++'", "'--'", "'\"'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LLAVEA", "LLAVEC", "PARENTESISA", "PARENTESISC", "PUNTOCOMA", 
			"COMA", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "EQ", "IFF", "IWHILE", "IFOR", "PALABRA", "FLOAT_VARIABLE", 
			"COMP", "OPERADORLOGICO", "ITERACIONSUMA", "ITERACIONRESTA", "COMILLA", 
			"PUNTO", "OTRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			instrucciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVEA:
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case IFF:
			case IWHILE:
			case IFOR:
			case PALABRA:
			case FLOAT_VARIABLE:
			case COMILLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				instruccion();
				setState(71);
				instrucciones();
				}
				break;
			case EOF:
			case LLAVEC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public DefincionFuncionContext defincionFuncion() {
			return getRuleContext(DefincionFuncionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				iif();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				operacionesaritlogicas();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				declaracion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				asignacion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				declaracionFuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				llamadaFuncion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				defincionFuncion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				iwhile();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				ifor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(idParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(idParser.LLAVEC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LLAVEA);
			setState(89);
			instrucciones();
			setState(90);
			match(LLAVEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(idParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(idParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(idParser.DOUBLE, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesFuncionesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(idParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(idParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(idParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(idParser.VOID, 0); }
		public TypesFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesFunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterTypesFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitTypesFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitTypesFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesFuncionesContext typesFunciones() throws RecognitionException {
		TypesFuncionesContext _localctx = new TypesFuncionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typesFunciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Permutacion_variablesContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(idParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(idParser.COMILLA, i);
		}
		public TerminalNode FLOAT_VARIABLE() { return getToken(idParser.FLOAT_VARIABLE, 0); }
		public Permutacion_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permutacion_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterPermutacion_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitPermutacion_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitPermutacion_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Permutacion_variablesContext permutacion_variables() throws RecognitionException {
		Permutacion_variablesContext _localctx = new Permutacion_variablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_permutacion_variables);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PALABRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(PALABRA);
				}
				break;
			case COMILLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(COMILLA);
				setState(98);
				match(PALABRA);
				setState(99);
				match(COMILLA);
				}
				break;
			case FLOAT_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(FLOAT_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Permutacion_variable_validar_tipoContext extends ParserRuleContext {
		public Permutacion_variablesContext permutacion_variables() {
			return getRuleContext(Permutacion_variablesContext.class,0);
		}
		public Permutacion_variable_validar_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permutacion_variable_validar_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterPermutacion_variable_validar_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitPermutacion_variable_validar_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitPermutacion_variable_validar_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Permutacion_variable_validar_tipoContext permutacion_variable_validar_tipo() throws RecognitionException {
		Permutacion_variable_validar_tipoContext _localctx = new Permutacion_variable_validar_tipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_permutacion_variable_validar_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			permutacion_variables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IFF() { return getToken(idParser.IFF, 0); }
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IFF);
			setState(106);
			match(PARENTESISA);
			setState(107);
			operacionesaritlogicas();
			setState(108);
			match(PARENTESISC);
			setState(109);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operacionaritlogicas_variableContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(idParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(idParser.COMILLA, i);
		}
		public TerminalNode FLOAT_VARIABLE() { return getToken(idParser.FLOAT_VARIABLE, 0); }
		public Operacionaritlogicas_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionaritlogicas_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperacionaritlogicas_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperacionaritlogicas_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperacionaritlogicas_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacionaritlogicas_variableContext operacionaritlogicas_variable() throws RecognitionException {
		Operacionaritlogicas_variableContext _localctx = new Operacionaritlogicas_variableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacionaritlogicas_variable);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PALABRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(PALABRA);
				}
				break;
			case COMILLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(COMILLA);
				setState(113);
				match(PALABRA);
				setState(114);
				match(COMILLA);
				}
				break;
			case FLOAT_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(FLOAT_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operacionaritlogicas_comparacionContext extends ParserRuleContext {
		public List<Operacionaritlogicas_variableContext> operacionaritlogicas_variable() {
			return getRuleContexts(Operacionaritlogicas_variableContext.class);
		}
		public Operacionaritlogicas_variableContext operacionaritlogicas_variable(int i) {
			return getRuleContext(Operacionaritlogicas_variableContext.class,i);
		}
		public TerminalNode COMP() { return getToken(idParser.COMP, 0); }
		public Operacionaritlogicas_comparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionaritlogicas_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperacionaritlogicas_comparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperacionaritlogicas_comparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperacionaritlogicas_comparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacionaritlogicas_comparacionContext operacionaritlogicas_comparacion() throws RecognitionException {
		Operacionaritlogicas_comparacionContext _localctx = new Operacionaritlogicas_comparacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacionaritlogicas_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			operacionaritlogicas_variable();
			setState(119);
			match(COMP);
			setState(120);
			operacionaritlogicas_variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionesaritlogicasContext extends ParserRuleContext {
		public Operacionaritlogicas_comparacionContext operacionaritlogicas_comparacion() {
			return getRuleContext(Operacionaritlogicas_comparacionContext.class,0);
		}
		public TerminalNode OPERADORLOGICO() { return getToken(idParser.OPERADORLOGICO, 0); }
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public OperacionesaritlogicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionesaritlogicas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperacionesaritlogicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperacionesaritlogicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperacionesaritlogicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesaritlogicasContext operacionesaritlogicas() throws RecognitionException {
		OperacionesaritlogicasContext _localctx = new OperacionesaritlogicasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operacionesaritlogicas);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				operacionaritlogicas_comparacion();
				setState(123);
				match(OPERADORLOGICO);
				setState(124);
				operacionesaritlogicas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				operacionaritlogicas_comparacion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode IWHILE() { return getToken(idParser.IWHILE, 0); }
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IWHILE);
			setState(130);
			match(PARENTESISA);
			setState(131);
			operacionesaritlogicas();
			setState(132);
			match(PARENTESISC);
			setState(133);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IforContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(idParser.IFOR, 0); }
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public OperacionesaritlogicasContext operacionesaritlogicas() {
			return getRuleContext(OperacionesaritlogicasContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public Ifor_iteracionContext ifor_iteracion() {
			return getRuleContext(Ifor_iteracionContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IFOR);
			setState(136);
			match(PARENTESISA);
			setState(137);
			declaracion();
			setState(138);
			operacionesaritlogicas();
			setState(139);
			match(PUNTOCOMA);
			setState(140);
			ifor_iteracion();
			setState(141);
			match(PARENTESISC);
			setState(142);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ifor_iteracionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public Ifor_iteracionContext ifor_iteracion() {
			return getRuleContext(Ifor_iteracionContext.class,0);
		}
		public TerminalNode ITERACIONRESTA() { return getToken(idParser.ITERACIONRESTA, 0); }
		public TerminalNode ITERACIONSUMA() { return getToken(idParser.ITERACIONSUMA, 0); }
		public Ifor_iteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor_iteracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterIfor_iteracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitIfor_iteracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitIfor_iteracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifor_iteracionContext ifor_iteracion() throws RecognitionException {
		Ifor_iteracionContext _localctx = new Ifor_iteracionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifor_iteracion);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(PALABRA);
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==ITERACIONSUMA || _la==ITERACIONRESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				match(COMA);
				setState(147);
				ifor_iteracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(PALABRA);
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==ITERACIONSUMA || _la==ITERACIONRESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			types();
			setState(153);
			declarar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclararContext extends ParserRuleContext {
		public DeclararAsignacionContext declararAsignacion() {
			return getRuleContext(DeclararAsignacionContext.class,0);
		}
		public DeclararSinAsignacionContext declararSinAsignacion() {
			return getRuleContext(DeclararSinAsignacionContext.class,0);
		}
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declarar);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				declararAsignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				declararSinAsignacion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclararAsignacionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode EQ() { return getToken(idParser.EQ, 0); }
		public Permutacion_variable_validar_tipoContext permutacion_variable_validar_tipo() {
			return getRuleContext(Permutacion_variable_validar_tipoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public DeclararAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclararAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclararAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclararAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararAsignacionContext declararAsignacion() throws RecognitionException {
		DeclararAsignacionContext _localctx = new DeclararAsignacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declararAsignacion);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(PALABRA);
				setState(160);
				match(EQ);
				setState(161);
				permutacion_variable_validar_tipo();
				setState(162);
				match(COMA);
				setState(163);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(PALABRA);
				setState(166);
				match(EQ);
				setState(167);
				permutacion_variable_validar_tipo();
				setState(168);
				match(PUNTOCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclararSinAsignacionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public DeclararSinAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararSinAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclararSinAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclararSinAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclararSinAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararSinAsignacionContext declararSinAsignacion() throws RecognitionException {
		DeclararSinAsignacionContext _localctx = new DeclararSinAsignacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declararSinAsignacion);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(PALABRA);
				setState(173);
				match(COMA);
				setState(174);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(PALABRA);
				setState(176);
				match(PUNTOCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode EQ() { return getToken(idParser.EQ, 0); }
		public Permutacion_variable_validar_tipoContext permutacion_variable_validar_tipo() {
			return getRuleContext(Permutacion_variable_validar_tipoContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(PALABRA);
			setState(180);
			match(EQ);
			setState(181);
			permutacion_variable_validar_tipo();
			setState(182);
			operaciones();
			setState(183);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionesContext extends ParserRuleContext {
		public OperadoresNumericosContext operadoresNumericos() {
			return getRuleContext(OperadoresNumericosContext.class,0);
		}
		public Permutacion_variable_validar_tipoContext permutacion_variable_validar_tipo() {
			return getRuleContext(Permutacion_variable_validar_tipoContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operaciones);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
			case MULTIPLICACION:
			case DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				operadoresNumericos();
				setState(186);
				permutacion_variable_validar_tipo();
				setState(187);
				operaciones();
				}
				break;
			case PUNTOCOMA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadoresNumericosContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(idParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(idParser.RESTA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(idParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(idParser.DIVISION, 0); }
		public OperadoresNumericosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoresNumericos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterOperadoresNumericos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitOperadoresNumericos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitOperadoresNumericos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresNumericosContext operadoresNumericos() throws RecognitionException {
		OperadoresNumericosContext _localctx = new OperadoresNumericosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operadoresNumericos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionFuncion_NombreContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public DeclaracionFuncion_NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion_Nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracionFuncion_Nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracionFuncion_Nombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracionFuncion_Nombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncion_NombreContext declaracionFuncion_Nombre() throws RecognitionException {
		DeclaracionFuncion_NombreContext _localctx = new DeclaracionFuncion_NombreContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracionFuncion_Nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PALABRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TypesFuncionesContext typesFunciones() {
			return getRuleContext(TypesFuncionesContext.class,0);
		}
		public DeclaracionFuncion_NombreContext declaracionFuncion_Nombre() {
			return getRuleContext(DeclaracionFuncion_NombreContext.class,0);
		}
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public ParametrosDeclaracionConcatenadosContext parametrosDeclaracionConcatenados() {
			return getRuleContext(ParametrosDeclaracionConcatenadosContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracionFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			typesFunciones();
			setState(197);
			declaracionFuncion_Nombre();
			setState(198);
			match(PARENTESISA);
			setState(199);
			parametrosDeclaracionConcatenados();
			setState(200);
			match(PARENTESISC);
			setState(201);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosDeclaracionConcatenadosContext extends ParserRuleContext {
		public DeclaracionFuncion_parametrosContext declaracionFuncion_parametros() {
			return getRuleContext(DeclaracionFuncion_parametrosContext.class,0);
		}
		public ParametrosDeclaracionConcatenadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosDeclaracionConcatenados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametrosDeclaracionConcatenados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametrosDeclaracionConcatenados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitParametrosDeclaracionConcatenados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosDeclaracionConcatenadosContext parametrosDeclaracionConcatenados() throws RecognitionException {
		ParametrosDeclaracionConcatenadosContext _localctx = new ParametrosDeclaracionConcatenadosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parametrosDeclaracionConcatenados);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				declaracionFuncion_parametros();
				}
				break;
			case PARENTESISC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionFuncion_parametrosContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public DeclaracionFuncion_parametrosContext declaracionFuncion_parametros() {
			return getRuleContext(DeclaracionFuncion_parametrosContext.class,0);
		}
		public DeclaracionFuncion_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDeclaracionFuncion_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDeclaracionFuncion_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDeclaracionFuncion_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncion_parametrosContext declaracionFuncion_parametros() throws RecognitionException {
		DeclaracionFuncion_parametrosContext _localctx = new DeclaracionFuncion_parametrosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracionFuncion_parametros);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				types();
				setState(208);
				match(PALABRA);
				setState(209);
				match(COMA);
				setState(210);
				declaracionFuncion_parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				types();
				setState(213);
				match(COMA);
				setState(214);
				declaracionFuncion_parametros();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				types();
				setState(217);
				match(PALABRA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				types();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public ParametrosLlamadaFuncionContext parametrosLlamadaFuncion() {
			return getRuleContext(ParametrosLlamadaFuncionContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(idParser.PUNTOCOMA, 0); }
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamadaFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PALABRA);
			setState(223);
			match(PARENTESISA);
			setState(224);
			parametrosLlamadaFuncion();
			setState(225);
			match(PARENTESISC);
			setState(226);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosLlamadaFuncionContext extends ParserRuleContext {
		public ParametrosConcatenadosContext parametrosConcatenados() {
			return getRuleContext(ParametrosConcatenadosContext.class,0);
		}
		public ParametrosLlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosLlamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametrosLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametrosLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitParametrosLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosLlamadaFuncionContext parametrosLlamadaFuncion() throws RecognitionException {
		ParametrosLlamadaFuncionContext _localctx = new ParametrosLlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametrosLlamadaFuncion);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PALABRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				parametrosConcatenados();
				}
				break;
			case PARENTESISC:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosConcatenadosContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public ParametrosConcatenadosContext parametrosConcatenados() {
			return getRuleContext(ParametrosConcatenadosContext.class,0);
		}
		public ParametrosConcatenadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosConcatenados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametrosConcatenados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametrosConcatenados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitParametrosConcatenados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosConcatenadosContext parametrosConcatenados() throws RecognitionException {
		ParametrosConcatenadosContext _localctx = new ParametrosConcatenadosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametrosConcatenados);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(PALABRA);
				setState(233);
				match(COMA);
				setState(234);
				parametrosConcatenados();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(PALABRA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionFuncion_parametro_nombreContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public DefinicionFuncion_parametro_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFuncion_parametro_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicionFuncion_parametro_nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicionFuncion_parametro_nombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicionFuncion_parametro_nombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionFuncion_parametro_nombreContext definicionFuncion_parametro_nombre() throws RecognitionException {
		DefinicionFuncion_parametro_nombreContext _localctx = new DefinicionFuncion_parametro_nombreContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_definicionFuncion_parametro_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(PALABRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionFuncion_NombreContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public DefinicionFuncion_NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFuncion_Nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicionFuncion_Nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicionFuncion_Nombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicionFuncion_Nombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionFuncion_NombreContext definicionFuncion_Nombre() throws RecognitionException {
		DefinicionFuncion_NombreContext _localctx = new DefinicionFuncion_NombreContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_definicionFuncion_Nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PALABRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefincionFuncion_parametros_global_ruleContext extends ParserRuleContext {
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public DefinicionFuncion_parametros_internal_ruleContext definicionFuncion_parametros_internal_rule() {
			return getRuleContext(DefinicionFuncion_parametros_internal_ruleContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public DefincionFuncion_parametros_global_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defincionFuncion_parametros_global_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefincionFuncion_parametros_global_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefincionFuncion_parametros_global_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefincionFuncion_parametros_global_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefincionFuncion_parametros_global_ruleContext defincionFuncion_parametros_global_rule() throws RecognitionException {
		DefincionFuncion_parametros_global_ruleContext _localctx = new DefincionFuncion_parametros_global_ruleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defincionFuncion_parametros_global_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(PARENTESISA);
			setState(243);
			definicionFuncion_parametros_internal_rule();
			setState(244);
			match(PARENTESISC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionFuncion_parametros_internal_ruleContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DefinicionFuncion_parametro_nombreContext definicionFuncion_parametro_nombre() {
			return getRuleContext(DefinicionFuncion_parametro_nombreContext.class,0);
		}
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public DefinicionFuncion_parametros_internal_ruleContext definicionFuncion_parametros_internal_rule() {
			return getRuleContext(DefinicionFuncion_parametros_internal_ruleContext.class,0);
		}
		public DefinicionFuncion_parametros_internal_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFuncion_parametros_internal_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefinicionFuncion_parametros_internal_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefinicionFuncion_parametros_internal_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefinicionFuncion_parametros_internal_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionFuncion_parametros_internal_ruleContext definicionFuncion_parametros_internal_rule() throws RecognitionException {
		DefinicionFuncion_parametros_internal_ruleContext _localctx = new DefinicionFuncion_parametros_internal_ruleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_definicionFuncion_parametros_internal_rule);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				types();
				setState(247);
				definicionFuncion_parametro_nombre();
				setState(248);
				match(COMA);
				setState(249);
				definicionFuncion_parametros_internal_rule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				types();
				setState(252);
				definicionFuncion_parametro_nombre();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefincionFuncionContext extends ParserRuleContext {
		public TypesFuncionesContext typesFunciones() {
			return getRuleContext(TypesFuncionesContext.class,0);
		}
		public DefinicionFuncion_NombreContext definicionFuncion_Nombre() {
			return getRuleContext(DefinicionFuncion_NombreContext.class,0);
		}
		public DefincionFuncion_parametros_global_ruleContext defincionFuncion_parametros_global_rule() {
			return getRuleContext(DefincionFuncion_parametros_global_ruleContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DefincionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defincionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterDefincionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitDefincionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitDefincionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefincionFuncionContext defincionFuncion() throws RecognitionException {
		DefincionFuncionContext _localctx = new DefincionFuncionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_defincionFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			typesFunciones();
			setState(258);
			definicionFuncion_Nombre();
			setState(259);
			defincionFuncion_parametros_global_rule();
			setState(260);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0109\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\bh\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13w\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0082\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0099\n\20\3\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00a0\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00ad\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00b4\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00c1\n\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00d0"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00df\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u00e9\n"+
		"\35\3\36\3\36\3\36\3\36\5\36\u00ef\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0102\n\"\3#\3#\3#\3#\3#\3#\2\2"+
		"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\6\3\2\n\r\3\2\n\16\3\2\33\34\3\2\17\22\2\u0102\2F\3\2\2\2\4L\3\2\2\2"+
		"\6X\3\2\2\2\bZ\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22"+
		"k\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30\u0081\3\2\2\2\32\u0083\3\2\2\2\34"+
		"\u0089\3\2\2\2\36\u0098\3\2\2\2 \u009a\3\2\2\2\"\u009f\3\2\2\2$\u00ac"+
		"\3\2\2\2&\u00b3\3\2\2\2(\u00b5\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3\2\2\2."+
		"\u00c4\3\2\2\2\60\u00c6\3\2\2\2\62\u00cf\3\2\2\2\64\u00de\3\2\2\2\66\u00e0"+
		"\3\2\2\28\u00e8\3\2\2\2:\u00ee\3\2\2\2<\u00f0\3\2\2\2>\u00f2\3\2\2\2@"+
		"\u00f4\3\2\2\2B\u0101\3\2\2\2D\u0103\3\2\2\2FG\5\4\3\2G\3\3\2\2\2HI\5"+
		"\6\4\2IJ\5\4\3\2JM\3\2\2\2KM\3\2\2\2LH\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NY"+
		"\5\b\5\2OY\5\22\n\2PY\5\30\r\2QY\5 \21\2RY\5(\25\2SY\5\60\31\2TY\5\66"+
		"\34\2UY\5D#\2VY\5\32\16\2WY\5\34\17\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ"+
		"\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y"+
		"\7\3\2\2\2Z[\7\4\2\2[\\\5\4\3\2\\]\7\5\2\2]\t\3\2\2\2^_\t\2\2\2_\13\3"+
		"\2\2\2`a\t\3\2\2a\r\3\2\2\2bh\7\27\2\2cd\7\35\2\2de\7\27\2\2eh\7\35\2"+
		"\2fh\7\30\2\2gb\3\2\2\2gc\3\2\2\2gf\3\2\2\2h\17\3\2\2\2ij\5\16\b\2j\21"+
		"\3\2\2\2kl\7\24\2\2lm\7\6\2\2mn\5\30\r\2no\7\7\2\2op\5\b\5\2p\23\3\2\2"+
		"\2qw\7\27\2\2rs\7\35\2\2st\7\27\2\2tw\7\35\2\2uw\7\30\2\2vq\3\2\2\2vr"+
		"\3\2\2\2vu\3\2\2\2w\25\3\2\2\2xy\5\24\13\2yz\7\31\2\2z{\5\24\13\2{\27"+
		"\3\2\2\2|}\5\26\f\2}~\7\32\2\2~\177\5\30\r\2\177\u0082\3\2\2\2\u0080\u0082"+
		"\5\26\f\2\u0081|\3\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2\2\u0083\u0084"+
		"\7\25\2\2\u0084\u0085\7\6\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\7\2\2"+
		"\u0087\u0088\5\b\5\2\u0088\33\3\2\2\2\u0089\u008a\7\26\2\2\u008a\u008b"+
		"\7\6\2\2\u008b\u008c\5 \21\2\u008c\u008d\5\30\r\2\u008d\u008e\7\b\2\2"+
		"\u008e\u008f\5\36\20\2\u008f\u0090\7\7\2\2\u0090\u0091\5\b\5\2\u0091\35"+
		"\3\2\2\2\u0092\u0093\7\27\2\2\u0093\u0094\t\4\2\2\u0094\u0095\7\t\2\2"+
		"\u0095\u0099\5\36\20\2\u0096\u0097\7\27\2\2\u0097\u0099\t\4\2\2\u0098"+
		"\u0092\3\2\2\2\u0098\u0096\3\2\2\2\u0099\37\3\2\2\2\u009a\u009b\5\n\6"+
		"\2\u009b\u009c\5\"\22\2\u009c!\3\2\2\2\u009d\u00a0\5$\23\2\u009e\u00a0"+
		"\5&\24\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0#\3\2\2\2\u00a1"+
		"\u00a2\7\27\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5"+
		"\7\t\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00ad\3\2\2\2\u00a7\u00a8\7\27\2\2"+
		"\u00a8\u00a9\7\23\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\b\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad%\3\2\2\2\u00ae"+
		"\u00af\7\27\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b4\5\"\22\2\u00b1\u00b2\7"+
		"\27\2\2\u00b2\u00b4\7\b\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\'\3\2\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\5\20"+
		"\t\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\7\b\2\2\u00ba)\3\2\2\2\u00bb\u00bc"+
		"\5,\27\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\5*\26\2\u00be\u00c1\3\2\2\2"+
		"\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1+\3"+
		"\2\2\2\u00c2\u00c3\t\5\2\2\u00c3-\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5/"+
		"\3\2\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\5.\30\2\u00c8\u00c9\7\6\2\2\u00c9"+
		"\u00ca\5\62\32\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\7\b\2\2\u00cc\61\3\2"+
		"\2\2\u00cd\u00d0\5\64\33\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\63\3\2\2\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\7\27\2"+
		"\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\5\64\33\2\u00d5\u00df\3\2\2\2\u00d6"+
		"\u00d7\5\n\6\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\5\64\33\2\u00d9\u00df\3"+
		"\2\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\7\27\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00df\5\n\6\2\u00de\u00d1\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00da\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\65\3\2\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e2"+
		"\7\6\2\2\u00e2\u00e3\58\35\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\7\b\2\2\u00e5"+
		"\67\3\2\2\2\u00e6\u00e9\5:\36\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e8\u00e7\3\2\2\2\u00e99\3\2\2\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec"+
		"\7\t\2\2\u00ec\u00ef\5:\36\2\u00ed\u00ef\7\27\2\2\u00ee\u00ea\3\2\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef;\3\2\2\2\u00f0\u00f1\7\27\2\2\u00f1=\3\2\2"+
		"\2\u00f2\u00f3\7\27\2\2\u00f3?\3\2\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6"+
		"\5B\"\2\u00f6\u00f7\7\7\2\2\u00f7A\3\2\2\2\u00f8\u00f9\5\n\6\2\u00f9\u00fa"+
		"\5<\37\2\u00fa\u00fb\7\t\2\2\u00fb\u00fc\5B\"\2\u00fc\u0102\3\2\2\2\u00fd"+
		"\u00fe\5\n\6\2\u00fe\u00ff\5<\37\2\u00ff\u0102\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00f8\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"C\3\2\2\2\u0103\u0104\5\f\7\2\u0104\u0105\5> \2\u0105\u0106\5@!\2\u0106"+
		"\u0107\5\b\5\2\u0107E\3\2\2\2\21LXgv\u0081\u0098\u009f\u00ac\u00b3\u00c0"+
		"\u00cf\u00de\u00e8\u00ee\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}