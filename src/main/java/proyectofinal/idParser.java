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
		WS=1, LLAVEA=2, LLAVEC=3, PUNTOCOMA=4, COMA=5, INT=6, FLOAT=7, CHAR=8, 
		SUMA=9, RESTA=10, MULTIPLICACION=11, DIVISION=12, EQ=13, PALABRA=14;
	public static final int
		RULE_types = 0, RULE_s = 1, RULE_instrucciones = 2, RULE_instruccion = 3, 
		RULE_bloque = 4, RULE_declaracion = 5, RULE_declarar = 6, RULE_declararAsignacion = 7, 
		RULE_declararSinAsignacion = 8, RULE_asignacion = 9, RULE_operaciones = 10, 
		RULE_operadoresNumericos = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"types", "s", "instrucciones", "instruccion", "bloque", "declaracion", 
			"declarar", "declararAsignacion", "declararSinAsignacion", "asignacion", 
			"operaciones", "operadoresNumericos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "';'", "','", "'int'", "'float'", "'char'", 
			"'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LLAVEA", "LLAVEC", "PUNTOCOMA", "COMA", "INT", "FLOAT", 
			"CHAR", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "EQ", "PALABRA"
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
			setState(24);
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
		enterRule(_localctx, 2, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVEA:
			case INT:
			case FLOAT:
			case CHAR:
			case PALABRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				instruccion();
				setState(29);
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
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				bloque();
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				declaracion();
				}
				break;
			case PALABRA:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				asignacion();
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
		enterRule(_localctx, 8, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(LLAVEA);
			setState(40);
			instrucciones();
			setState(41);
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
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			types();
			setState(44);
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
		enterRule(_localctx, 12, RULE_declarar);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				declararAsignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
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
		enterRule(_localctx, 14, RULE_declararAsignacion);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(PALABRA);
				setState(51);
				match(EQ);
				setState(52);
				match(PALABRA);
				setState(53);
				match(COMA);
				setState(54);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(PALABRA);
				setState(56);
				match(EQ);
				setState(57);
				match(PALABRA);
				setState(58);
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
		enterRule(_localctx, 16, RULE_declararSinAsignacion);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(PALABRA);
				setState(62);
				match(COMA);
				setState(63);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(PALABRA);
				setState(65);
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(PALABRA);
			setState(69);
			match(EQ);
			setState(70);
			match(PALABRA);
			setState(71);
			operaciones();
			setState(72);
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
		enterRule(_localctx, 20, RULE_operaciones);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
			case MULTIPLICACION:
			case DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				operadoresNumericos();
				setState(75);
				match(PALABRA);
				setState(76);
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
		enterRule(_localctx, 22, RULE_operadoresNumericos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3\5\3\5\5"+
		"\5(\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b\63\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t>\n\t\3\n\3\n\3\n\3\n\3\n\5\nE\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fR\n\f\3\r\3\r\3\r\2\2\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\4\3\2\b\n\3\2\13\16\2P\2\32\3\2\2\2\4\34"+
		"\3\2\2\2\6\"\3\2\2\2\b\'\3\2\2\2\n)\3\2\2\2\f-\3\2\2\2\16\62\3\2\2\2\20"+
		"=\3\2\2\2\22D\3\2\2\2\24F\3\2\2\2\26Q\3\2\2\2\30S\3\2\2\2\32\33\t\2\2"+
		"\2\33\3\3\2\2\2\34\35\5\6\4\2\35\5\3\2\2\2\36\37\5\b\5\2\37 \5\6\4\2 "+
		"#\3\2\2\2!#\3\2\2\2\"\36\3\2\2\2\"!\3\2\2\2#\7\3\2\2\2$(\5\n\6\2%(\5\f"+
		"\7\2&(\5\24\13\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2\2\2)*\7\4\2\2"+
		"*+\5\6\4\2+,\7\5\2\2,\13\3\2\2\2-.\5\2\2\2./\5\16\b\2/\r\3\2\2\2\60\63"+
		"\5\20\t\2\61\63\5\22\n\2\62\60\3\2\2\2\62\61\3\2\2\2\63\17\3\2\2\2\64"+
		"\65\7\20\2\2\65\66\7\17\2\2\66\67\7\20\2\2\678\7\7\2\28>\5\16\b\29:\7"+
		"\20\2\2:;\7\17\2\2;<\7\20\2\2<>\7\6\2\2=\64\3\2\2\2=9\3\2\2\2>\21\3\2"+
		"\2\2?@\7\20\2\2@A\7\7\2\2AE\5\16\b\2BC\7\20\2\2CE\7\6\2\2D?\3\2\2\2DB"+
		"\3\2\2\2E\23\3\2\2\2FG\7\20\2\2GH\7\17\2\2HI\7\20\2\2IJ\5\26\f\2JK\7\6"+
		"\2\2K\25\3\2\2\2LM\5\30\r\2MN\7\20\2\2NO\5\26\f\2OR\3\2\2\2PR\3\2\2\2"+
		"QL\3\2\2\2QP\3\2\2\2R\27\3\2\2\2ST\t\3\2\2T\31\3\2\2\2\b\"\'\62=DQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}