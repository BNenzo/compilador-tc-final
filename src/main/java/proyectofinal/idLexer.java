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
		WS=1, LLAVEA=2, LLAVEC=3, PARENTESISA=4, PARENTESISC=5, PUNTOCOMA=6, COMA=7, 
		INT=8, FLOAT=9, DOUBLE=10, CHAR=11, VOID=12, SUMA=13, RESTA=14, MULTIPLICACION=15, 
		DIVISION=16, EQ=17, IFF=18, IWHILE=19, IFOR=20, PALABRA=21, COMP=22, OPERADORLOGICO=23, 
		ITERACIONSUMA=24, ITERACIONRESTA=25, COMILLA=26, PUNTO=27, OTRO=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "LLAVEA", "LLAVEC", "PARENTESISA", "PARENTESISC", 
			"PUNTOCOMA", "COMA", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "EQ", "IFF", "IWHILE", "IFOR", 
			"PALABRA", "COMP", "OPERADORLOGICO", "ITERACIONSUMA", "ITERACIONRESTA", 
			"COMILLA", "PUNTO", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'('", "')'", "';'", "','", "'int'", "'float'", 
			"'double'", "'char'", "'void'", "'+'", "'-'", "'*'", "'/'", "'='", "'if'", 
			"'while'", "'for'", null, null, null, "'++'", "'--'", "'\"'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LLAVEA", "LLAVEC", "PARENTESISA", "PARENTESISC", "PUNTOCOMA", 
			"COMA", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "EQ", "IFF", "IWHILE", "IFOR", "PALABRA", "COMP", "OPERADORLOGICO", 
			"ITERACIONSUMA", "ITERACIONRESTA", "COMILLA", "PUNTO", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\6\4E\n\4\r\4\16\4F\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u008b"+
		"\n\30\f\30\16\30\u008e\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u009a\n\31\3\32\3\32\3\32\3\32\5\32\u00a0\n\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\2\2 \3\2"+
		"\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00b5\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7D\3\2"+
		"\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3\2"+
		"\2\2\25V\3\2\2\2\27Z\3\2\2\2\31`\3\2\2\2\33g\3\2\2\2\35l\3\2\2\2\37q\3"+
		"\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+~\3\2\2\2-\u0084"+
		"\3\2\2\2/\u008c\3\2\2\2\61\u0099\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2"+
		"\2\2\67\u00a4\3\2\2\29\u00a7\3\2\2\2;\u00a9\3\2\2\2=\u00ab\3\2\2\2?@\t"+
		"\2\2\2@\4\3\2\2\2AB\t\3\2\2B\6\3\2\2\2CE\t\4\2\2DC\3\2\2\2EF\3\2\2\2F"+
		"D\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\4\2\2I\b\3\2\2\2JK\7}\2\2K\n\3\2\2\2"+
		"LM\7\177\2\2M\f\3\2\2\2NO\7*\2\2O\16\3\2\2\2PQ\7+\2\2Q\20\3\2\2\2RS\7"+
		"=\2\2S\22\3\2\2\2TU\7.\2\2U\24\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\26"+
		"\3\2\2\2Z[\7h\2\2[\\\7n\2\2\\]\7q\2\2]^\7c\2\2^_\7v\2\2_\30\3\2\2\2`a"+
		"\7f\2\2ab\7q\2\2bc\7w\2\2cd\7d\2\2de\7n\2\2ef\7g\2\2f\32\3\2\2\2gh\7e"+
		"\2\2hi\7j\2\2ij\7c\2\2jk\7t\2\2k\34\3\2\2\2lm\7x\2\2mn\7q\2\2no\7k\2\2"+
		"op\7f\2\2p\36\3\2\2\2qr\7-\2\2r \3\2\2\2st\7/\2\2t\"\3\2\2\2uv\7,\2\2"+
		"v$\3\2\2\2wx\7\61\2\2x&\3\2\2\2yz\7?\2\2z(\3\2\2\2{|\7k\2\2|}\7h\2\2}"+
		"*\3\2\2\2~\177\7y\2\2\177\u0080\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082"+
		"\7n\2\2\u0082\u0083\7g\2\2\u0083,\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u0087\7t\2\2\u0087.\3\2\2\2\u0088\u008b\5\3\2\2\u0089\u008b"+
		"\5\5\3\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\60\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u009a\7>\2\2\u0090\u0091\7>\2\2\u0091\u009a\7?\2\2\u0092\u0093"+
		"\7?\2\2\u0093\u009a\7?\2\2\u0094\u009a\7@\2\2\u0095\u0096\7@\2\2\u0096"+
		"\u009a\7?\2\2\u0097\u0098\7#\2\2\u0098\u009a\7?\2\2\u0099\u008f\3\2\2"+
		"\2\u0099\u0090\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\62\3\2\2\2\u009b\u009c\7(\2\2\u009c"+
		"\u00a0\7(\2\2\u009d\u009e\7~\2\2\u009e\u00a0\7~\2\2\u009f\u009b\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3"+
		"\7-\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7/\2\2\u00a68"+
		"\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8:\3\2\2\2\u00a9\u00aa\7\60\2\2\u00aa"+
		"<\3\2\2\2\u00ab\u00ac\13\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\37\2"+
		"\2\u00ae>\3\2\2\2\b\2F\u008a\u008c\u0099\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}