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
		INT=8, FLOAT=9, CHAR=10, VOID=11, SUMA=12, RESTA=13, MULTIPLICACION=14, 
		DIVISION=15, EQ=16, PALABRA=17;
	public static final int
		RULE_types = 0, RULE_typesFunciones = 1, RULE_s = 2, RULE_instrucciones = 3, 
		RULE_instruccion = 4, RULE_bloque = 5, RULE_declaracion = 6, RULE_declarar = 7, 
		RULE_declararAsignacion = 8, RULE_declararSinAsignacion = 9, RULE_asignacion = 10, 
		RULE_operaciones = 11, RULE_operadoresNumericos = 12, RULE_declaracionFuncion = 13, 
		RULE_parametrosDeclaracionConcatenados = 14, RULE_parametrosFuncion = 15, 
		RULE_llamadaFuncion = 16, RULE_parametrosLlamadaFuncion = 17, RULE_parametrosConcatenados = 18, 
		RULE_defincionFuncion = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"types", "typesFunciones", "s", "instrucciones", "instruccion", "bloque", 
			"declaracion", "declarar", "declararAsignacion", "declararSinAsignacion", 
			"asignacion", "operaciones", "operadoresNumericos", "declaracionFuncion", 
			"parametrosDeclaracionConcatenados", "parametrosFuncion", "llamadaFuncion", 
			"parametrosLlamadaFuncion", "parametrosConcatenados", "defincionFuncion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'('", "')'", "';'", "','", "'int'", "'float'", 
			"'char'", "'void'", "'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LLAVEA", "LLAVEC", "PARENTESISA", "PARENTESISC", "PUNTOCOMA", 
			"COMA", "INT", "FLOAT", "CHAR", "VOID", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "EQ", "PALABRA"
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(idParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(idParser.CHAR, 0); }
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
		enterRule(_localctx, 0, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
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
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_typesFunciones);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				types();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(VOID);
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
		enterRule(_localctx, 4, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
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
		enterRule(_localctx, 6, RULE_instrucciones);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVEA:
			case INT:
			case FLOAT:
			case CHAR:
			case VOID:
			case PALABRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				instruccion();
				setState(49);
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
		enterRule(_localctx, 8, RULE_instruccion);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				declaracionFuncion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				llamadaFuncion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				defincionFuncion();
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
		enterRule(_localctx, 10, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LLAVEA);
			setState(63);
			instrucciones();
			setState(64);
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
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			types();
			setState(67);
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
		enterRule(_localctx, 14, RULE_declarar);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				declararAsignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
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
		public List<TerminalNode> PALABRA() { return getTokens(idParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(idParser.PALABRA, i);
		}
		public TerminalNode EQ() { return getToken(idParser.EQ, 0); }
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
		enterRule(_localctx, 16, RULE_declararAsignacion);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(PALABRA);
				setState(74);
				match(EQ);
				setState(75);
				match(PALABRA);
				setState(76);
				match(COMA);
				setState(77);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(PALABRA);
				setState(79);
				match(EQ);
				setState(80);
				match(PALABRA);
				setState(81);
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
		enterRule(_localctx, 18, RULE_declararSinAsignacion);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(PALABRA);
				setState(85);
				match(COMA);
				setState(86);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(PALABRA);
				setState(88);
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
		public List<TerminalNode> PALABRA() { return getTokens(idParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(idParser.PALABRA, i);
		}
		public TerminalNode EQ() { return getToken(idParser.EQ, 0); }
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PALABRA);
			setState(92);
			match(EQ);
			setState(93);
			match(PALABRA);
			setState(94);
			operaciones();
			setState(95);
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
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
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
		enterRule(_localctx, 22, RULE_operaciones);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
			case MULTIPLICACION:
			case DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				operadoresNumericos();
				setState(98);
				match(PALABRA);
				setState(99);
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
		enterRule(_localctx, 24, RULE_operadoresNumericos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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

	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TypesFuncionesContext typesFunciones() {
			return getRuleContext(TypesFuncionesContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
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
		enterRule(_localctx, 26, RULE_declaracionFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			typesFunciones();
			setState(107);
			match(PALABRA);
			setState(108);
			match(PARENTESISA);
			setState(109);
			parametrosDeclaracionConcatenados();
			setState(110);
			match(PARENTESISC);
			setState(111);
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
		public ParametrosFuncionContext parametrosFuncion() {
			return getRuleContext(ParametrosFuncionContext.class,0);
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
		enterRule(_localctx, 28, RULE_parametrosDeclaracionConcatenados);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				parametrosFuncion();
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

	public static class ParametrosFuncionContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(idParser.COMA, 0); }
		public ParametrosFuncionContext parametrosFuncion() {
			return getRuleContext(ParametrosFuncionContext.class,0);
		}
		public ParametrosFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterParametrosFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitParametrosFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitParametrosFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosFuncionContext parametrosFuncion() throws RecognitionException {
		ParametrosFuncionContext _localctx = new ParametrosFuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametrosFuncion);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				types();
				setState(118);
				match(PALABRA);
				setState(119);
				match(COMA);
				setState(120);
				parametrosFuncion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				types();
				setState(123);
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
		enterRule(_localctx, 32, RULE_llamadaFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PALABRA);
			setState(128);
			match(PARENTESISA);
			setState(129);
			parametrosLlamadaFuncion();
			setState(130);
			match(PARENTESISC);
			setState(131);
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
		enterRule(_localctx, 34, RULE_parametrosLlamadaFuncion);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PALABRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
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
		enterRule(_localctx, 36, RULE_parametrosConcatenados);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(PALABRA);
				setState(138);
				match(COMA);
				setState(139);
				parametrosConcatenados();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
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

	public static class DefincionFuncionContext extends ParserRuleContext {
		public TypesFuncionesContext typesFunciones() {
			return getRuleContext(TypesFuncionesContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(idParser.PALABRA, 0); }
		public TerminalNode PARENTESISA() { return getToken(idParser.PARENTESISA, 0); }
		public ParametrosDeclaracionConcatenadosContext parametrosDeclaracionConcatenados() {
			return getRuleContext(ParametrosDeclaracionConcatenadosContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(idParser.PARENTESISC, 0); }
		public TerminalNode LLAVEA() { return getToken(idParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(idParser.LLAVEC, 0); }
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
		enterRule(_localctx, 38, RULE_defincionFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			typesFunciones();
			setState(144);
			match(PALABRA);
			setState(145);
			match(PARENTESISA);
			setState(146);
			parametrosDeclaracionConcatenados();
			setState(147);
			match(PARENTESISC);
			setState(148);
			match(LLAVEA);
			setState(149);
			instrucciones();
			setState(150);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\5\3/\n\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\5\tJ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"U\n\n\3\13\3\13\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\ri\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20v\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0080"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u008a\n\23\3\24\3\24"+
		"\3\24\3\24\5\24\u0090\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\n\f"+
		"\3\2\16\21\2\u0095\2*\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\66\3\2\2\2\n>"+
		"\3\2\2\2\f@\3\2\2\2\16D\3\2\2\2\20I\3\2\2\2\22T\3\2\2\2\24[\3\2\2\2\26"+
		"]\3\2\2\2\30h\3\2\2\2\32j\3\2\2\2\34l\3\2\2\2\36u\3\2\2\2 \177\3\2\2\2"+
		"\"\u0081\3\2\2\2$\u0089\3\2\2\2&\u008f\3\2\2\2(\u0091\3\2\2\2*+\t\2\2"+
		"\2+\3\3\2\2\2,/\5\2\2\2-/\7\r\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61"+
		"\5\b\5\2\61\7\3\2\2\2\62\63\5\n\6\2\63\64\5\b\5\2\64\67\3\2\2\2\65\67"+
		"\3\2\2\2\66\62\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\28?\5\f\7\29?\5\16\b\2"+
		":?\5\26\f\2;?\5\34\17\2<?\5\"\22\2=?\5(\25\2>8\3\2\2\2>9\3\2\2\2>:\3\2"+
		"\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\13\3\2\2\2@A\7\4\2\2AB\5\b\5\2BC\7"+
		"\5\2\2C\r\3\2\2\2DE\5\2\2\2EF\5\20\t\2F\17\3\2\2\2GJ\5\22\n\2HJ\5\24\13"+
		"\2IG\3\2\2\2IH\3\2\2\2J\21\3\2\2\2KL\7\23\2\2LM\7\22\2\2MN\7\23\2\2NO"+
		"\7\t\2\2OU\5\20\t\2PQ\7\23\2\2QR\7\22\2\2RS\7\23\2\2SU\7\b\2\2TK\3\2\2"+
		"\2TP\3\2\2\2U\23\3\2\2\2VW\7\23\2\2WX\7\t\2\2X\\\5\20\t\2YZ\7\23\2\2Z"+
		"\\\7\b\2\2[V\3\2\2\2[Y\3\2\2\2\\\25\3\2\2\2]^\7\23\2\2^_\7\22\2\2_`\7"+
		"\23\2\2`a\5\30\r\2ab\7\b\2\2b\27\3\2\2\2cd\5\32\16\2de\7\23\2\2ef\5\30"+
		"\r\2fi\3\2\2\2gi\3\2\2\2hc\3\2\2\2hg\3\2\2\2i\31\3\2\2\2jk\t\3\2\2k\33"+
		"\3\2\2\2lm\5\4\3\2mn\7\23\2\2no\7\6\2\2op\5\36\20\2pq\7\7\2\2qr\7\b\2"+
		"\2r\35\3\2\2\2sv\5 \21\2tv\3\2\2\2us\3\2\2\2ut\3\2\2\2v\37\3\2\2\2wx\5"+
		"\2\2\2xy\7\23\2\2yz\7\t\2\2z{\5 \21\2{\u0080\3\2\2\2|}\5\2\2\2}~\7\23"+
		"\2\2~\u0080\3\2\2\2\177w\3\2\2\2\177|\3\2\2\2\u0080!\3\2\2\2\u0081\u0082"+
		"\7\23\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5$\23\2\u0084\u0085\7\7\2\2"+
		"\u0085\u0086\7\b\2\2\u0086#\3\2\2\2\u0087\u008a\5&\24\2\u0088\u008a\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a%\3\2\2\2\u008b\u008c"+
		"\7\23\2\2\u008c\u008d\7\t\2\2\u008d\u0090\5&\24\2\u008e\u0090\7\23\2\2"+
		"\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090\'\3\2\2\2\u0091\u0092\5"+
		"\4\3\2\u0092\u0093\7\23\2\2\u0093\u0094\7\6\2\2\u0094\u0095\5\36\20\2"+
		"\u0095\u0096\7\7\2\2\u0096\u0097\7\4\2\2\u0097\u0098\5\b\5\2\u0098\u0099"+
		"\7\5\2\2\u0099)\3\2\2\2\r.\66>IT[hu\177\u0089\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}