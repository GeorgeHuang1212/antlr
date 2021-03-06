// Generated from Rose.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTS=1, WHITESPACE=2, BEGIN=3, DECLARE=4, ELSE=5, END=6, EXIT=7, FOR=8, 
		IF=9, IN=10, INTEGER=11, IS=12, LOOP=13, PROCEDURE=14, READ=15, THEN=16, 
		WRITE=17, COLON=18, RANGE=19, SEMICOLON=20, ADD=21, MINUS=22, ASTERISK=23, 
		SLASH=24, PERCENT=25, EQUAL=26, ANGLE_BRACKETS=27, GREATER_THAN=28, GREATER_THAN_OR_EQUAL=29, 
		LESS_THAN=30, LESS_THAN_OR_EQUAL=31, AND=32, OR=33, EXCLAMATION=34, ASSIGNMENT=35, 
		LEFT_PARENTHESES=36, RIGHT_PARENTHESES=37, ID=38, CONST_INT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENTS", "WHITESPACE", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", 
			"FOR", "IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", 
			"WRITE", "COLON", "RANGE", "SEMICOLON", "ADD", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "EQUAL", "ANGLE_BRACKETS", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN", "LESS_THAN_OR_EQUAL", "AND", "OR", "EXCLAMATION", "ASSIGNMENT", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "UPPER_LETTER", "DIGIT", "UNDERSCORE", 
			"ID", "CONST_INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", 
			"'for'", "'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", 
			"'read'", "'then'", "'write'", "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'!'", "':='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENTS", "WHITESPACE", "BEGIN", "DECLARE", "ELSE", "END", "EXIT", 
			"FOR", "IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", "READ", "THEN", 
			"WRITE", "COLON", "RANGE", "SEMICOLON", "ADD", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "EQUAL", "ANGLE_BRACKETS", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN", "LESS_THAN_OR_EQUAL", "AND", "OR", "EXCLAMATION", "ASSIGNMENT", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "ID", "CONST_INT"
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


	public RoseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rose.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\2\3\2\3\3\6\3f\n\3\r"+
		"\3\16\3g\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u00f3\n*\3*\3*\3*\7*\u00f8"+
		"\n*\f*\16*\u00fb\13*\3+\3+\3+\7+\u0100\n+\f+\16+\u0103\13+\5+\u0105\n"+
		"+\3]\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S(U)\3\2\6\5\2\13\f\17\17\"\"\3\2C"+
		"\\\3\2\62;\3\2\63;\2\u010a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\3W\3\2\2\2\5e\3\2\2\2\7k\3\2\2\2\tq\3\2\2\2\13y\3\2\2\2\r~\3\2\2\2\17"+
		"\u0082\3\2\2\2\21\u0087\3\2\2\2\23\u008b\3\2\2\2\25\u008e\3\2\2\2\27\u0091"+
		"\3\2\2\2\31\u0099\3\2\2\2\33\u009c\3\2\2\2\35\u00a1\3\2\2\2\37\u00ab\3"+
		"\2\2\2!\u00b0\3\2\2\2#\u00b5\3\2\2\2%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00c0"+
		"\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2"+
		"\63\u00ca\3\2\2\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d1\3\2\2\2;\u00d3"+
		"\3\2\2\2=\u00d6\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C\u00de\3\2\2\2E"+
		"\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2\2\2M\u00ea\3\2"+
		"\2\2O\u00ec\3\2\2\2Q\u00ee\3\2\2\2S\u00f2\3\2\2\2U\u0104\3\2\2\2WX\7\61"+
		"\2\2XY\7\61\2\2Y]\3\2\2\2Z\\\13\2\2\2[Z\3\2\2\2\\_\3\2\2\2]^\3\2\2\2]"+
		"[\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\f\2\2ab\3\2\2\2bc\b\2\2\2c\4\3\2\2\2"+
		"df\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\3\2\2"+
		"j\6\3\2\2\2kl\7d\2\2lm\7g\2\2mn\7i\2\2no\7k\2\2op\7p\2\2p\b\3\2\2\2qr"+
		"\7f\2\2rs\7g\2\2st\7e\2\2tu\7n\2\2uv\7c\2\2vw\7t\2\2wx\7g\2\2x\n\3\2\2"+
		"\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\f\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7f\2\2\u0081\16\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7z\2\2\u0084\u0085\7k\2\2\u0085\u0086\7v\2\2\u0086\20\3\2\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\22\3\2\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7h\2\2\u008d\24\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7p\2\2\u0090\26\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7g\2\2\u0095\u0096\7i\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7t\2\2\u0098\30\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7u\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7n\2\2\u009d\u009e\7q\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7r\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7f\2\2"+
		"\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\36\3\2"+
		"\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af"+
		"\7f\2\2\u00af \3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"$\3\2\2\2\u00bb\u00bc\7<\2\2\u00bc&\3\2\2\2\u00bd\u00be\7\60\2\2\u00be"+
		"\u00bf\7\60\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1*\3\2\2\2\u00c2"+
		"\u00c3\7-\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5.\3\2\2\2\u00c6\u00c7"+
		"\7,\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\62\3\2\2\2\u00ca\u00cb"+
		"\7\'\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\66\3\2\2\2\u00ce\u00cf"+
		"\7>\2\2\u00cf\u00d0\7@\2\2\u00d08\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2:\3"+
		"\2\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d5\7?\2\2\u00d5<\3\2\2\2\u00d6\u00d7"+
		"\7>\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\u00da\7?\2\2\u00da@\3"+
		"\2\2\2\u00db\u00dc\7(\2\2\u00dc\u00dd\7(\2\2\u00ddB\3\2\2\2\u00de\u00df"+
		"\7~\2\2\u00df\u00e0\7~\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2F\3"+
		"\2\2\2\u00e3\u00e4\7<\2\2\u00e4\u00e5\7?\2\2\u00e5H\3\2\2\2\u00e6\u00e7"+
		"\7*\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9L\3\2\2\2\u00ea\u00eb\t"+
		"\3\2\2\u00ebN\3\2\2\2\u00ec\u00ed\t\4\2\2\u00edP\3\2\2\2\u00ee\u00ef\7"+
		"a\2\2\u00efR\3\2\2\2\u00f0\u00f3\5M\'\2\u00f1\u00f3\5Q)\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f8\5M\'\2\u00f5"+
		"\u00f8\5O(\2\u00f6\u00f8\5Q)\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00faT\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0105\7\62\2\2\u00fd"+
		"\u0101\t\5\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0105V\3\2\2\2"+
		"\n\2]g\u00f2\u00f7\u00f9\u0101\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}