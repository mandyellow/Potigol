// Generated from potigol.g4 by ANTLR 4.5.2
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class potigolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, ID=55, INT=56, FLOAT=57, STRING=58, BS=59, MS=60, 
		ES=61, CHAR=62, BOOLEANO=63, WS=64, COMMENT=65, NL=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "ID", "ALPHA", "ACENTO", 
		"INT", "FLOAT", "DIGIT", "STRING", "BS", "MS", "ES", "CHAR", "BOOLEANO", 
		"ESC", "WS", "COMMENT", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'escreva'", "'imprima'", "':='", "'['", "']'", "'='", "'var'", 
		"'('", "')'", "':'", "'fim'", "'tipo'", "'use'", "','", "'=>'", "'.'", 
		"'^'", "'::'", "'formato'", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'<>'", "'nao'", "'n\\u00e3o'", 
		"'e'", "'ou'", "'se'", "'entao'", "'ent\\u00e3o'", "'senaose'", "'sen\\u00e3ose'", 
		"'senao'", "'sen\\u00e3o'", "'escolha'", "'caso'", "'para'", "'gere'", 
		"'enquanto'", "'em'", "'de'", "'ate'", "'at\\u00e9'", "'passo'", "'faca'", 
		"'fa\\u00e7a'", null, null, null, null, null, null, null, null, null, 
		null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ID", "INT", "FLOAT", "STRING", 
		"BS", "MS", "ES", "CHAR", "BOOLEANO", "WS", "COMMENT", "NL"
	};
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


	public potigolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "potigol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\58\u016c\n8\38\38"+
		"\38\78\u0171\n8\f8\168\u0174\138\39\39\3:\3:\3;\6;\u017b\n;\r;\16;\u017c"+
		"\3<\6<\u0180\n<\r<\16<\u0181\3<\3<\6<\u0186\n<\r<\16<\u0187\3<\3<\6<\u018c"+
		"\n<\r<\16<\u018d\5<\u0190\n<\3=\3=\3>\3>\3>\7>\u0197\n>\f>\16>\u019a\13"+
		">\3>\3>\3?\3?\7?\u01a0\n?\f?\16?\u01a3\13?\3?\3?\3@\3@\7@\u01a9\n@\f@"+
		"\16@\u01ac\13@\3@\3@\3A\3A\7A\u01b2\nA\fA\16A\u01b5\13A\3A\3A\3B\3B\3"+
		"B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u01cc\nC\3D\3D\3"+
		"D\3D\5D\u01d2\nD\3E\6E\u01d5\nE\rE\16E\u01d6\3E\3E\3F\3F\7F\u01dd\nF\f"+
		"F\16F\u01e0\13F\3F\5F\u01e3\nF\3F\3F\3F\3F\3G\3G\3G\3G\7\u0198\u01a1\u01aa"+
		"\u01b3\u01de\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q\2s\2u:w;y\2{<}=\177>\u0081?\u0083@\u0085A\u0087\2\u0089"+
		"B\u008bC\u008dD\3\2\6\5\2C\\aac|\3\2}}\3\2$$\5\2\13\13\17\17\"\"\u01fa"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0097\3\2\2\2\7\u009f\3\2\2"+
		"\2\t\u00a2\3\2\2\2\13\u00a4\3\2\2\2\r\u00a6\3\2\2\2\17\u00a8\3\2\2\2\21"+
		"\u00ac\3\2\2\2\23\u00ae\3\2\2\2\25\u00b0\3\2\2\2\27\u00b2\3\2\2\2\31\u00b6"+
		"\3\2\2\2\33\u00bb\3\2\2\2\35\u00bf\3\2\2\2\37\u00c1\3\2\2\2!\u00c4\3\2"+
		"\2\2#\u00c6\3\2\2\2%\u00c8\3\2\2\2\'\u00cb\3\2\2\2)\u00d3\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00df\3\2\2"+
		"\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ed"+
		"\3\2\2\2?\u00f0\3\2\2\2A\u00f3\3\2\2\2C\u00f7\3\2\2\2E\u00fb\3\2\2\2G"+
		"\u00fd\3\2\2\2I\u0100\3\2\2\2K\u0103\3\2\2\2M\u0109\3\2\2\2O\u010f\3\2"+
		"\2\2Q\u0117\3\2\2\2S\u011f\3\2\2\2U\u0125\3\2\2\2W\u012b\3\2\2\2Y\u0133"+
		"\3\2\2\2[\u0138\3\2\2\2]\u013d\3\2\2\2_\u0142\3\2\2\2a\u014b\3\2\2\2c"+
		"\u014e\3\2\2\2e\u0151\3\2\2\2g\u0155\3\2\2\2i\u0159\3\2\2\2k\u015f\3\2"+
		"\2\2m\u0164\3\2\2\2o\u016b\3\2\2\2q\u0175\3\2\2\2s\u0177\3\2\2\2u\u017a"+
		"\3\2\2\2w\u018f\3\2\2\2y\u0191\3\2\2\2{\u0193\3\2\2\2}\u019d\3\2\2\2\177"+
		"\u01a6\3\2\2\2\u0081\u01af\3\2\2\2\u0083\u01b8\3\2\2\2\u0085\u01cb\3\2"+
		"\2\2\u0087\u01d1\3\2\2\2\u0089\u01d4\3\2\2\2\u008b\u01da\3\2\2\2\u008d"+
		"\u01e8\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7u\2\2\u0091\u0092\7e\2"+
		"\2\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7x\2\2\u0095\u0096"+
		"\7c\2\2\u0096\4\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099\u009a"+
		"\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7o\2\2\u009d"+
		"\u009e\7c\2\2\u009e\6\3\2\2\2\u009f\u00a0\7<\2\2\u00a0\u00a1\7?\2\2\u00a1"+
		"\b\3\2\2\2\u00a2\u00a3\7]\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5"+
		"\f\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7x\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad"+
		"\22\3\2\2\2\u00ae\u00af\7+\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1"+
		"\26\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7o\2\2\u00b5"+
		"\30\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7r\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\36\3\2\2\2\u00c1"+
		"\u00c2\7?\2\2\u00c2\u00c3\7@\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5"+
		"\"\3\2\2\2\u00c6\u00c7\7`\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7<\2\2\u00c9"+
		"\u00ca\7<\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7q\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4*\3\2\2\2\u00d5"+
		"\u00d6\7/\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8.\3\2\2\2\u00d9\u00da"+
		"\7\61\2\2\u00da\60\3\2\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7x\2\2\u00de\62\3\2\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7f\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\66\3\2\2\2\u00e5"+
		"\u00e6\7@\2\2\u00e6\u00e7\7?\2\2\u00e78\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9"+
		":\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7?\2\2\u00ec<\3\2\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee\u00ef\7?\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2"+
		"\7@\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7\u00e5\2\2\u00f9"+
		"\u00fa\7q\2\2\u00faD\3\2\2\2\u00fb\u00fc\7g\2\2\u00fcF\3\2\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7w\2\2\u00ffH\3\2\2\2\u0100\u0101\7u\2\2\u0101\u0102"+
		"\7g\2\2\u0102J\3\2\2\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105\u0106"+
		"\7v\2\2\u0106\u0107\7c\2\2\u0107\u0108\7q\2\2\u0108L\3\2\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c\7v\2\2\u010c\u010d\7\u00e5\2\2"+
		"\u010d\u010e\7q\2\2\u010eN\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7g\2"+
		"\2\u0111\u0112\7p\2\2\u0112\u0113\7c\2\2\u0113\u0114\7q\2\2\u0114\u0115"+
		"\7u\2\2\u0115\u0116\7g\2\2\u0116P\3\2\2\2\u0117\u0118\7u\2\2\u0118\u0119"+
		"\7g\2\2\u0119\u011a\7p\2\2\u011a\u011b\7\u00e5\2\2\u011b\u011c\7q\2\2"+
		"\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2\u011eR\3\2\2\2\u011f\u0120\7u\2"+
		"\2\u0120\u0121\7g\2\2\u0121\u0122\7p\2\2\u0122\u0123\7c\2\2\u0123\u0124"+
		"\7q\2\2\u0124T\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127\7g\2\2\u0127\u0128"+
		"\7p\2\2\u0128\u0129\7\u00e5\2\2\u0129\u012a\7q\2\2\u012aV\3\2\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7u\2\2\u012d\u012e\7e\2\2\u012e\u012f\7q\2\2"+
		"\u012f\u0130\7n\2\2\u0130\u0131\7j\2\2\u0131\u0132\7c\2\2\u0132X\3\2\2"+
		"\2\u0133\u0134\7e\2\2\u0134\u0135\7c\2\2\u0135\u0136\7u\2\2\u0136\u0137"+
		"\7q\2\2\u0137Z\3\2\2\2\u0138\u0139\7r\2\2\u0139\u013a\7c\2\2\u013a\u013b"+
		"\7t\2\2\u013b\u013c\7c\2\2\u013c\\\3\2\2\2\u013d\u013e\7i\2\2\u013e\u013f"+
		"\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141\7g\2\2\u0141^\3\2\2\2\u0142\u0143"+
		"\7g\2\2\u0143\u0144\7p\2\2\u0144\u0145\7s\2\2\u0145\u0146\7w\2\2\u0146"+
		"\u0147\7c\2\2\u0147\u0148\7p\2\2\u0148\u0149\7v\2\2\u0149\u014a\7q\2\2"+
		"\u014a`\3\2\2\2\u014b\u014c\7g\2\2\u014c\u014d\7o\2\2\u014db\3\2\2\2\u014e"+
		"\u014f\7f\2\2\u014f\u0150\7g\2\2\u0150d\3\2\2\2\u0151\u0152\7c\2\2\u0152"+
		"\u0153\7v\2\2\u0153\u0154\7g\2\2\u0154f\3\2\2\2\u0155\u0156\7c\2\2\u0156"+
		"\u0157\7v\2\2\u0157\u0158\7\u00eb\2\2\u0158h\3\2\2\2\u0159\u015a\7r\2"+
		"\2\u015a\u015b\7c\2\2\u015b\u015c\7u\2\2\u015c\u015d\7u\2\2\u015d\u015e"+
		"\7q\2\2\u015ej\3\2\2\2\u015f\u0160\7h\2\2\u0160\u0161\7c\2\2\u0161\u0162"+
		"\7e\2\2\u0162\u0163\7c\2\2\u0163l\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166"+
		"\7c\2\2\u0166\u0167\7\u00e9\2\2\u0167\u0168\7c\2\2\u0168n\3\2\2\2\u0169"+
		"\u016c\5q9\2\u016a\u016c\5s:\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2"+
		"\u016c\u0172\3\2\2\2\u016d\u0171\5q9\2\u016e\u0171\5s:\2\u016f\u0171\5"+
		"y=\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173p\3\2\2\2"+
		"\u0174\u0172\3\2\2\2\u0175\u0176\t\2\2\2\u0176r\3\2\2\2\u0177\u0178\4"+
		"\u00a3\ufffe\2\u0178t\3\2\2\2\u0179\u017b\5y=\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dv\3\2\2\2"+
		"\u017e\u0180\5y=\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\7\60\2\2"+
		"\u0184\u0186\5y=\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0190\3\2\2\2\u0189\u018b\7\60\2\2"+
		"\u018a\u018c\5y=\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u017f\3\2\2\2\u018f"+
		"\u0189\3\2\2\2\u0190x\3\2\2\2\u0191\u0192\4\62;\2\u0192z\3\2\2\2\u0193"+
		"\u0198\7$\2\2\u0194\u0197\5\u0087D\2\u0195\u0197\n\3\2\2\u0196\u0194\3"+
		"\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0199\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7$"+
		"\2\2\u019c|\3\2\2\2\u019d\u01a1\7$\2\2\u019e\u01a0\n\4\2\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7}\2\2\u01a5~\3\2\2\2\u01a6"+
		"\u01aa\7\177\2\2\u01a7\u01a9\n\4\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01ae\7}\2\2\u01ae\u0080\3\2\2\2\u01af\u01b3\7\177"+
		"\2\2\u01b0\u01b2\n\3\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b7\7$\2\2\u01b7\u0082\3\2\2\2\u01b8\u01b9\7)\2\2\u01b9\u01ba"+
		"\13\2\2\2\u01ba\u01bb\7)\2\2\u01bb\u0084\3\2\2\2\u01bc\u01bd\7x\2\2\u01bd"+
		"\u01be\7g\2\2\u01be\u01bf\7t\2\2\u01bf\u01c0\7f\2\2\u01c0\u01c1\7c\2\2"+
		"\u01c1\u01c2\7f\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5"+
		"\7t\2\2\u01c5\u01cc\7q\2\2\u01c6\u01c7\7h\2\2\u01c7\u01c8\7c\2\2\u01c8"+
		"\u01c9\7n\2\2\u01c9\u01ca\7u\2\2\u01ca\u01cc\7q\2\2\u01cb\u01bc\3\2\2"+
		"\2\u01cb\u01c6\3\2\2\2\u01cc\u0086\3\2\2\2\u01cd\u01ce\7^\2\2\u01ce\u01d2"+
		"\7$\2\2\u01cf\u01d0\7^\2\2\u01d0\u01d2\7^\2\2\u01d1\u01cd\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u0088\3\2\2\2\u01d3\u01d5\t\5\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\bE\2\2\u01d9\u008a\3\2\2\2\u01da\u01de\7%\2"+
		"\2\u01db\u01dd\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e1\u01e3\7\17\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e5\7\f\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\bF"+
		"\3\2\u01e7\u008c\3\2\2\2\u01e8\u01e9\7\f\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\bG\4\2\u01eb\u008e\3\2\2\2\25\2\u016b\u0170\u0172\u017c\u0181\u0187"+
		"\u018d\u018f\u0196\u0198\u01a1\u01aa\u01b3\u01cb\u01d1\u01d6\u01de\u01e2"+
		"\5\b\2\2\2\3\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}