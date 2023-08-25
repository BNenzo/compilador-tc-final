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
		ITERACIONSUMA=24, ITERACIONRESTA=25;
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
			"PALABRA", "COMP", "OPERADORLOGICO", "ITERACIONSUMA", "ITERACIONRESTA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'('", "')'", "';'", "','", "'int'", "'float'", 
			"'double'", "'char'", "'void'", "'+'", "'-'", "'*'", "'/'", "'='", "'if'", 
			"'while'", "'for'", null, null, null, "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LLAVEA", "LLAVEC", "PARENTESISA", "PARENTESISC", "PUNTOCOMA", 
			"COMA", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "EQ", "IFF", "IWHILE", "IFOR", "PALABRA", "COMP", "OPERADORLOGICO", 
			"ITERACIONSUMA", "ITERACIONRESTA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\6\4?\n\4\r\4\16"+
		"\4@\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\7\30\u0085\n\30\f\30\16\30\u0088\13\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0094\n\31\3\32"+
		"\3\32\3\32\3\32\5\32\u009a\n\32\3\33\3\33\3\33\3\34\3\34\3\34\2\2\35\3"+
		"\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33\3\2\5\4\2C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a7\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3"+
		"\2\2\2\5;\3\2\2\2\7>\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2"+
		"\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27T\3\2\2\2\31Z\3\2\2\2\33a\3"+
		"\2\2\2\35f\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2"+
		"\2)u\3\2\2\2+x\3\2\2\2-~\3\2\2\2/\u0086\3\2\2\2\61\u0093\3\2\2\2\63\u0099"+
		"\3\2\2\2\65\u009b\3\2\2\2\67\u009e\3\2\2\29:\t\2\2\2:\4\3\2\2\2;<\t\3"+
		"\2\2<\6\3\2\2\2=?\t\4\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3"+
		"\2\2\2BC\b\4\2\2C\b\3\2\2\2DE\7}\2\2E\n\3\2\2\2FG\7\177\2\2G\f\3\2\2\2"+
		"HI\7*\2\2I\16\3\2\2\2JK\7+\2\2K\20\3\2\2\2LM\7=\2\2M\22\3\2\2\2NO\7.\2"+
		"\2O\24\3\2\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\26\3\2\2\2TU\7h\2\2UV\7n\2"+
		"\2VW\7q\2\2WX\7c\2\2XY\7v\2\2Y\30\3\2\2\2Z[\7f\2\2[\\\7q\2\2\\]\7w\2\2"+
		"]^\7d\2\2^_\7n\2\2_`\7g\2\2`\32\3\2\2\2ab\7e\2\2bc\7j\2\2cd\7c\2\2de\7"+
		"t\2\2e\34\3\2\2\2fg\7x\2\2gh\7q\2\2hi\7k\2\2ij\7f\2\2j\36\3\2\2\2kl\7"+
		"-\2\2l \3\2\2\2mn\7/\2\2n\"\3\2\2\2op\7,\2\2p$\3\2\2\2qr\7\61\2\2r&\3"+
		"\2\2\2st\7?\2\2t(\3\2\2\2uv\7k\2\2vw\7h\2\2w*\3\2\2\2xy\7y\2\2yz\7j\2"+
		"\2z{\7k\2\2{|\7n\2\2|}\7g\2\2},\3\2\2\2~\177\7h\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7t\2\2\u0081.\3\2\2\2\u0082\u0085\5\3\2\2\u0083\u0085\5\5\3\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\60\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0094"+
		"\7>\2\2\u008a\u008b\7>\2\2\u008b\u0094\7?\2\2\u008c\u008d\7?\2\2\u008d"+
		"\u0094\7?\2\2\u008e\u0094\7@\2\2\u008f\u0090\7@\2\2\u0090\u0094\7?\2\2"+
		"\u0091\u0092\7#\2\2\u0092\u0094\7?\2\2\u0093\u0089\3\2\2\2\u0093\u008a"+
		"\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\62\3\2\2\2\u0095\u0096\7(\2\2\u0096\u009a\7(\2\2"+
		"\u0097\u0098\7~\2\2\u0098\u009a\7~\2\2\u0099\u0095\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\64\3\2\2\2\u009b\u009c\7-\2\2\u009c\u009d\7-\2\2\u009d"+
		"\66\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7/\2\2\u00a08\3\2\2\2\b\2@"+
		"\u0084\u0086\u0093\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}