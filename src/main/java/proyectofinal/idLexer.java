// Generated from c:\Users\Usuario\Desktop\FACULTAD\Finales\TC\proyectofinal\src\main\java\proyectofinal\id.g4 by ANTLR 4.9.2

  package proyectofinal;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LLAVEA=2, LLAVEC=3, PUNTOCOMA=4, COMA=5, INT=6, FLOAT=7, CHAR=8, 
		SUMA=9, RESTA=10, MULTIPLICACION=11, DIVISION=12, EQ=13, PALABRA=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "LLAVEA", "LLAVEC", "PUNTOCOMA", "COMA", "INT", 
			"FLOAT", "CHAR", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "EQ", 
			"PALABRA"
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


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21R\n\21\f\21\16"+
		"\21U\13\21\2\2\22\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2V\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2\2\2"+
		"\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\23"+
		":\3\2\2\2\25@\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2"+
		"\37M\3\2\2\2!S\3\2\2\2#$\t\2\2\2$\4\3\2\2\2%&\t\3\2\2&\6\3\2\2\2\')\t"+
		"\4\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\b\4\2\2-\b"+
		"\3\2\2\2./\7}\2\2/\n\3\2\2\2\60\61\7\177\2\2\61\f\3\2\2\2\62\63\7=\2\2"+
		"\63\16\3\2\2\2\64\65\7.\2\2\65\20\3\2\2\2\66\67\7k\2\2\678\7p\2\289\7"+
		"v\2\29\22\3\2\2\2:;\7h\2\2;<\7n\2\2<=\7q\2\2=>\7c\2\2>?\7v\2\2?\24\3\2"+
		"\2\2@A\7e\2\2AB\7j\2\2BC\7c\2\2CD\7t\2\2D\26\3\2\2\2EF\7-\2\2F\30\3\2"+
		"\2\2GH\7/\2\2H\32\3\2\2\2IJ\7,\2\2J\34\3\2\2\2KL\7\61\2\2L\36\3\2\2\2"+
		"MN\7?\2\2N \3\2\2\2OR\5\3\2\2PR\5\5\3\2QO\3\2\2\2QP\3\2\2\2RU\3\2\2\2"+
		"SQ\3\2\2\2ST\3\2\2\2T\"\3\2\2\2US\3\2\2\2\6\2*QS\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}