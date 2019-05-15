// Generated from E:/Projects/senpure/senpure-io/senpure-io-generator/src/main/resources\Io.g4 by ANTLR 4.7.2
package com.senpure.io.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ABSTRACT=23, ASSERT=24, 
		BOOLEAN=25, BREAK=26, BYTE=27, CASE=28, CATCH=29, CHAR=30, CLASS=31, CONST=32, 
		CONTINUE=33, DEFAULT=34, DO=35, DOUBLE=36, ELSE=37, ENUM=38, EXTENDS=39, 
		FINAL=40, FINALLY=41, FLOAT=42, FOR=43, IF=44, GOTO=45, IMPLEMENTS=46, 
		IMPORT=47, INSTANCEOF=48, INT=49, INTERFACE=50, LONG=51, NATIVE=52, NEW=53, 
		PACKAGE=54, PRIVATE=55, PROTECTED=56, PUBLIC=57, RETURN=58, SHORT=59, 
		STATIC=60, STRICTFP=61, SUPER=62, SWITCH=63, SYNCHRONIZED=64, THIS=65, 
		THROW=66, THROWS=67, TRANSIENT=68, TRY=69, VOID=70, VOLATILE=71, WHILE=72, 
		SELF=73, MESSAGEID=74, EVENTID=75, SERIALIZEDSIZE=76, Number=77, Identifier=78, 
		WS=79, COMMENT=80, LINE_COMMENT=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "ABSTRACT", "ASSERT", "BOOLEAN", 
			"BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", 
			"FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", 
			"INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
			"PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", 
			"SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", 
			"VOLATILE", "WHILE", "SELF", "MESSAGEID", "EVENTID", "SERIALIZEDSIZE", 
			"Number", "Letter", "LetterOrDigit", "DIGIT", "Identifier", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.io'", "'javaPack'", "'.'", "'namespace'", "'../'", "'/'", 
			"'\\'", "'{'", "'}'", "'message'", "'cs'", "'CS'", "'sc'", "'SC'", "'event'", 
			"'bean'", "'sint'", "'slong'", "'sfixed32'", "'sfixed64'", "'String'", 
			"'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'self'", 
			"'messageId'", "'eventId'", "'serializedSize'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ABSTRACT", 
			"ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
			"CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", 
			"FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", 
			"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
			"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
			"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
			"TRY", "VOID", "VOLATILE", "WHILE", "SELF", "MESSAGEID", "EVENTID", "SERIALIZEDSIZE", 
			"Number", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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


	public IoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Io.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u02bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3"+
		"J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\6N\u0290\nN\rN\16N\u0291\3"+
		"O\3O\3P\3P\3Q\3Q\3R\3R\7R\u029c\nR\fR\16R\u029f\13R\3S\6S\u02a2\nS\rS"+
		"\16S\u02a3\3S\3S\3T\3T\3T\3T\7T\u02ac\nT\fT\16T\u02af\13T\3T\3T\3T\3U"+
		"\3U\3U\3U\7U\u02b8\nU\fU\16U\u02bb\13U\3\u02ad\2V\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009d\2\u009f\2\u00a1\2\u00a3P\u00a5Q\u00a7R\u00a9"+
		"S\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u02bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00ad"+
		"\3\2\2\2\7\u00b1\3\2\2\2\t\u00ba\3\2\2\2\13\u00bc\3\2\2\2\r\u00c6\3\2"+
		"\2\2\17\u00ca\3\2\2\2\21\u00cc\3\2\2\2\23\u00ce\3\2\2\2\25\u00d0\3\2\2"+
		"\2\27\u00d2\3\2\2\2\31\u00da\3\2\2\2\33\u00dd\3\2\2\2\35\u00e0\3\2\2\2"+
		"\37\u00e3\3\2\2\2!\u00e6\3\2\2\2#\u00ec\3\2\2\2%\u00f1\3\2\2\2\'\u00f6"+
		"\3\2\2\2)\u00fc\3\2\2\2+\u0105\3\2\2\2-\u010e\3\2\2\2/\u0115\3\2\2\2\61"+
		"\u011e\3\2\2\2\63\u0125\3\2\2\2\65\u012d\3\2\2\2\67\u0133\3\2\2\29\u0138"+
		"\3\2\2\2;\u013d\3\2\2\2=\u0143\3\2\2\2?\u0148\3\2\2\2A\u014e\3\2\2\2C"+
		"\u0154\3\2\2\2E\u015d\3\2\2\2G\u0165\3\2\2\2I\u0168\3\2\2\2K\u016f\3\2"+
		"\2\2M\u0174\3\2\2\2O\u0179\3\2\2\2Q\u0181\3\2\2\2S\u0187\3\2\2\2U\u018f"+
		"\3\2\2\2W\u0195\3\2\2\2Y\u0199\3\2\2\2[\u019c\3\2\2\2]\u01a1\3\2\2\2_"+
		"\u01ac\3\2\2\2a\u01b3\3\2\2\2c\u01be\3\2\2\2e\u01c2\3\2\2\2g\u01cc\3\2"+
		"\2\2i\u01d1\3\2\2\2k\u01d8\3\2\2\2m\u01dc\3\2\2\2o\u01e4\3\2\2\2q\u01ec"+
		"\3\2\2\2s\u01f6\3\2\2\2u\u01fd\3\2\2\2w\u0204\3\2\2\2y\u020a\3\2\2\2{"+
		"\u0211\3\2\2\2}\u021a\3\2\2\2\177\u0220\3\2\2\2\u0081\u0227\3\2\2\2\u0083"+
		"\u0234\3\2\2\2\u0085\u0239\3\2\2\2\u0087\u023f\3\2\2\2\u0089\u0246\3\2"+
		"\2\2\u008b\u0250\3\2\2\2\u008d\u0254\3\2\2\2\u008f\u0259\3\2\2\2\u0091"+
		"\u0262\3\2\2\2\u0093\u0268\3\2\2\2\u0095\u026d\3\2\2\2\u0097\u0277\3\2"+
		"\2\2\u0099\u027f\3\2\2\2\u009b\u028f\3\2\2\2\u009d\u0293\3\2\2\2\u009f"+
		"\u0295\3\2\2\2\u00a1\u0297\3\2\2\2\u00a3\u0299\3\2\2\2\u00a5\u02a1\3\2"+
		"\2\2\u00a7\u02a7\3\2\2\2\u00a9\u02b3\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac"+
		"\4\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\6\3\2\2\2\u00b1\u00b2\7l\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7x"+
		"\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7m\2\2\u00b9\b\3\2\2\2\u00ba\u00bb\7\60\2\2\u00bb"+
		"\n\3\2\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7o\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7c\2\2"+
		"\u00c3\u00c4\7e\2\2\u00c4\u00c5\7g\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7\60"+
		"\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\61\2\2\u00c9\16\3\2\2\2\u00ca"+
		"\u00cb\7\61\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7^\2\2\u00cd\22\3\2\2\2\u00ce"+
		"\u00cf\7}\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7\177\2\2\u00d1\26\3\2\2\2"+
		"\u00d2\u00d3\7o\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\30\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7u\2\2\u00dc\32\3\2\2\2\u00dd"+
		"\u00de\7E\2\2\u00de\u00df\7U\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7e\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7E\2\2\u00e5"+
		" \3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7x\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb\"\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2\u00f0$\3\2\2\2\u00f1"+
		"\u00f2\7u\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5&\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2"+
		"\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7i\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7"+
		"u\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7z\2\2\u0100\u0101"+
		"\7g\2\2\u0101\u0102\7f\2\2\u0102\u0103\7\65\2\2\u0103\u0104\7\64\2\2\u0104"+
		"*\3\2\2\2\u0105\u0106\7u\2\2\u0106\u0107\7h\2\2\u0107\u0108\7k\2\2\u0108"+
		"\u0109\7z\2\2\u0109\u010a\7g\2\2\u010a\u010b\7f\2\2\u010b\u010c\78\2\2"+
		"\u010c\u010d\7\66\2\2\u010d,\3\2\2\2\u010e\u010f\7U\2\2\u010f\u0110\7"+
		"v\2\2\u0110\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114"+
		"\7i\2\2\u0114.\3\2\2\2\u0115\u0116\7c\2\2\u0116\u0117\7d\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7e\2\2\u011c\u011d\7v\2\2\u011d\60\3\2\2\2\u011e\u011f\7c\2\2\u011f"+
		"\u0120\7u\2\2\u0120\u0121\7u\2\2\u0121\u0122\7g\2\2\u0122\u0123\7t\2\2"+
		"\u0123\u0124\7v\2\2\u0124\62\3\2\2\2\u0125\u0126\7d\2\2\u0126\u0127\7"+
		"q\2\2\u0127\u0128\7q\2\2\u0128\u0129\7n\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7c\2\2\u012b\u012c\7p\2\2\u012c\64\3\2\2\2\u012d\u012e\7d\2\2\u012e\u012f"+
		"\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131\7c\2\2\u0131\u0132\7m\2\2\u0132"+
		"\66\3\2\2\2\u0133\u0134\7d\2\2\u0134\u0135\7{\2\2\u0135\u0136\7v\2\2\u0136"+
		"\u0137\7g\2\2\u01378\3\2\2\2\u0138\u0139\7e\2\2\u0139\u013a\7c\2\2\u013a"+
		"\u013b\7u\2\2\u013b\u013c\7g\2\2\u013c:\3\2\2\2\u013d\u013e\7e\2\2\u013e"+
		"\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140\u0141\7e\2\2\u0141\u0142\7j\2\2"+
		"\u0142<\3\2\2\2\u0143\u0144\7e\2\2\u0144\u0145\7j\2\2\u0145\u0146\7c\2"+
		"\2\u0146\u0147\7t\2\2\u0147>\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7"+
		"n\2\2\u014a\u014b\7c\2\2\u014b\u014c\7u\2\2\u014c\u014d\7u\2\2\u014d@"+
		"\3\2\2\2\u014e\u014f\7e\2\2\u014f\u0150\7q\2\2\u0150\u0151\7p\2\2\u0151"+
		"\u0152\7u\2\2\u0152\u0153\7v\2\2\u0153B\3\2\2\2\u0154\u0155\7e\2\2\u0155"+
		"\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157\u0158\7v\2\2\u0158\u0159\7k\2\2"+
		"\u0159\u015a\7p\2\2\u015a\u015b\7w\2\2\u015b\u015c\7g\2\2\u015cD\3\2\2"+
		"\2\u015d\u015e\7f\2\2\u015e\u015f\7g\2\2\u015f\u0160\7h\2\2\u0160\u0161"+
		"\7c\2\2\u0161\u0162\7w\2\2\u0162\u0163\7n\2\2\u0163\u0164\7v\2\2\u0164"+
		"F\3\2\2\2\u0165\u0166\7f\2\2\u0166\u0167\7q\2\2\u0167H\3\2\2\2\u0168\u0169"+
		"\7f\2\2\u0169\u016a\7q\2\2\u016a\u016b\7w\2\2\u016b\u016c\7d\2\2\u016c"+
		"\u016d\7n\2\2\u016d\u016e\7g\2\2\u016eJ\3\2\2\2\u016f\u0170\7g\2\2\u0170"+
		"\u0171\7n\2\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173L\3\2\2\2\u0174"+
		"\u0175\7g\2\2\u0175\u0176\7p\2\2\u0176\u0177\7w\2\2\u0177\u0178\7o\2\2"+
		"\u0178N\3\2\2\2\u0179\u017a\7g\2\2\u017a\u017b\7z\2\2\u017b\u017c\7v\2"+
		"\2\u017c\u017d\7g\2\2\u017d\u017e\7p\2\2\u017e\u017f\7f\2\2\u017f\u0180"+
		"\7u\2\2\u0180P\3\2\2\2\u0181\u0182\7h\2\2\u0182\u0183\7k\2\2\u0183\u0184"+
		"\7p\2\2\u0184\u0185\7c\2\2\u0185\u0186\7n\2\2\u0186R\3\2\2\2\u0187\u0188"+
		"\7h\2\2\u0188\u0189\7k\2\2\u0189\u018a\7p\2\2\u018a\u018b\7c\2\2\u018b"+
		"\u018c\7n\2\2\u018c\u018d\7n\2\2\u018d\u018e\7{\2\2\u018eT\3\2\2\2\u018f"+
		"\u0190\7h\2\2\u0190\u0191\7n\2\2\u0191\u0192\7q\2\2\u0192\u0193\7c\2\2"+
		"\u0193\u0194\7v\2\2\u0194V\3\2\2\2\u0195\u0196\7h\2\2\u0196\u0197\7q\2"+
		"\2\u0197\u0198\7t\2\2\u0198X\3\2\2\2\u0199\u019a\7k\2\2\u019a\u019b\7"+
		"h\2\2\u019bZ\3\2\2\2\u019c\u019d\7i\2\2\u019d\u019e\7q\2\2\u019e\u019f"+
		"\7v\2\2\u019f\u01a0\7q\2\2\u01a0\\\3\2\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3"+
		"\7o\2\2\u01a3\u01a4\7r\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7g\2\2\u01a6"+
		"\u01a7\7o\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7v\2\2"+
		"\u01aa\u01ab\7u\2\2\u01ab^\3\2\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7o\2"+
		"\2\u01ae\u01af\7r\2\2\u01af\u01b0\7q\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2"+
		"\7v\2\2\u01b2`\3\2\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6"+
		"\7u\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"\u01ba\7e\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd\7h\2\2"+
		"\u01bdb\3\2\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7v\2"+
		"\2\u01c1d\3\2\2\2\u01c2\u01c3\7k\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7"+
		"v\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9"+
		"\7c\2\2\u01c9\u01ca\7e\2\2\u01ca\u01cb\7g\2\2\u01cbf\3\2\2\2\u01cc\u01cd"+
		"\7n\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7i\2\2\u01d0"+
		"h\3\2\2\2\u01d1\u01d2\7p\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7v\2\2\u01d4"+
		"\u01d5\7k\2\2\u01d5\u01d6\7x\2\2\u01d6\u01d7\7g\2\2\u01d7j\3\2\2\2\u01d8"+
		"\u01d9\7p\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7y\2\2\u01dbl\3\2\2\2\u01dc"+
		"\u01dd\7r\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7e\2\2\u01df\u01e0\7m\2\2"+
		"\u01e0\u01e1\7c\2\2\u01e1\u01e2\7i\2\2\u01e2\u01e3\7g\2\2\u01e3n\3\2\2"+
		"\2\u01e4\u01e5\7r\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8"+
		"\7x\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7g\2\2\u01eb"+
		"p\3\2\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7q\2\2\u01ef"+
		"\u01f0\7v\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7e\2\2\u01f2\u01f3\7v\2\2"+
		"\u01f3\u01f4\7g\2\2\u01f4\u01f5\7f\2\2\u01f5r\3\2\2\2\u01f6\u01f7\7r\2"+
		"\2\u01f7\u01f8\7w\2\2\u01f8\u01f9\7d\2\2\u01f9\u01fa\7n\2\2\u01fa\u01fb"+
		"\7k\2\2\u01fb\u01fc\7e\2\2\u01fct\3\2\2\2\u01fd\u01fe\7t\2\2\u01fe\u01ff"+
		"\7g\2\2\u01ff\u0200\7v\2\2\u0200\u0201\7w\2\2\u0201\u0202\7t\2\2\u0202"+
		"\u0203\7p\2\2\u0203v\3\2\2\2\u0204\u0205\7u\2\2\u0205\u0206\7j\2\2\u0206"+
		"\u0207\7q\2\2\u0207\u0208\7t\2\2\u0208\u0209\7v\2\2\u0209x\3\2\2\2\u020a"+
		"\u020b\7u\2\2\u020b\u020c\7v\2\2\u020c\u020d\7c\2\2\u020d\u020e\7v\2\2"+
		"\u020e\u020f\7k\2\2\u020f\u0210\7e\2\2\u0210z\3\2\2\2\u0211\u0212\7u\2"+
		"\2\u0212\u0213\7v\2\2\u0213\u0214\7t\2\2\u0214\u0215\7k\2\2\u0215\u0216"+
		"\7e\2\2\u0216\u0217\7v\2\2\u0217\u0218\7h\2\2\u0218\u0219\7r\2\2\u0219"+
		"|\3\2\2\2\u021a\u021b\7u\2\2\u021b\u021c\7w\2\2\u021c\u021d\7r\2\2\u021d"+
		"\u021e\7g\2\2\u021e\u021f\7t\2\2\u021f~\3\2\2\2\u0220\u0221\7u\2\2\u0221"+
		"\u0222\7y\2\2\u0222\u0223\7k\2\2\u0223\u0224\7v\2\2\u0224\u0225\7e\2\2"+
		"\u0225\u0226\7j\2\2\u0226\u0080\3\2\2\2\u0227\u0228\7u\2\2\u0228\u0229"+
		"\7{\2\2\u0229\u022a\7p\2\2\u022a\u022b\7e\2\2\u022b\u022c\7j\2\2\u022c"+
		"\u022d\7t\2\2\u022d\u022e\7q\2\2\u022e\u022f\7p\2\2\u022f\u0230\7k\2\2"+
		"\u0230\u0231\7|\2\2\u0231\u0232\7g\2\2\u0232\u0233\7f\2\2\u0233\u0082"+
		"\3\2\2\2\u0234\u0235\7v\2\2\u0235\u0236\7j\2\2\u0236\u0237\7k\2\2\u0237"+
		"\u0238\7u\2\2\u0238\u0084\3\2\2\2\u0239\u023a\7v\2\2\u023a\u023b\7j\2"+
		"\2\u023b\u023c\7t\2\2\u023c\u023d\7q\2\2\u023d\u023e\7y\2\2\u023e\u0086"+
		"\3\2\2\2\u023f\u0240\7v\2\2\u0240\u0241\7j\2\2\u0241\u0242\7t\2\2\u0242"+
		"\u0243\7q\2\2\u0243\u0244\7y\2\2\u0244\u0245\7u\2\2\u0245\u0088\3\2\2"+
		"\2\u0246\u0247\7v\2\2\u0247\u0248\7t\2\2\u0248\u0249\7c\2\2\u0249\u024a"+
		"\7p\2\2\u024a\u024b\7u\2\2\u024b\u024c\7k\2\2\u024c\u024d\7g\2\2\u024d"+
		"\u024e\7p\2\2\u024e\u024f\7v\2\2\u024f\u008a\3\2\2\2\u0250\u0251\7v\2"+
		"\2\u0251\u0252\7t\2\2\u0252\u0253\7{\2\2\u0253\u008c\3\2\2\2\u0254\u0255"+
		"\7x\2\2\u0255\u0256\7q\2\2\u0256\u0257\7k\2\2\u0257\u0258\7f\2\2\u0258"+
		"\u008e\3\2\2\2\u0259\u025a\7x\2\2\u025a\u025b\7q\2\2\u025b\u025c\7n\2"+
		"\2\u025c\u025d\7c\2\2\u025d\u025e\7v\2\2\u025e\u025f\7k\2\2\u025f\u0260"+
		"\7n\2\2\u0260\u0261\7g\2\2\u0261\u0090\3\2\2\2\u0262\u0263\7y\2\2\u0263"+
		"\u0264\7j\2\2\u0264\u0265\7k\2\2\u0265\u0266\7n\2\2\u0266\u0267\7g\2\2"+
		"\u0267\u0092\3\2\2\2\u0268\u0269\7u\2\2\u0269\u026a\7g\2\2\u026a\u026b"+
		"\7n\2\2\u026b\u026c\7h\2\2\u026c\u0094\3\2\2\2\u026d\u026e\7o\2\2\u026e"+
		"\u026f\7g\2\2\u026f\u0270\7u\2\2\u0270\u0271\7u\2\2\u0271\u0272\7c\2\2"+
		"\u0272\u0273\7i\2\2\u0273\u0274\7g\2\2\u0274\u0275\7K\2\2\u0275\u0276"+
		"\7f\2\2\u0276\u0096\3\2\2\2\u0277\u0278\7g\2\2\u0278\u0279\7x\2\2\u0279"+
		"\u027a\7g\2\2\u027a\u027b\7p\2\2\u027b\u027c\7v\2\2\u027c\u027d\7K\2\2"+
		"\u027d\u027e\7f\2\2\u027e\u0098\3\2\2\2\u027f\u0280\7u\2\2\u0280\u0281"+
		"\7g\2\2\u0281\u0282\7t\2\2\u0282\u0283\7k\2\2\u0283\u0284\7c\2\2\u0284"+
		"\u0285\7n\2\2\u0285\u0286\7k\2\2\u0286\u0287\7|\2\2\u0287\u0288\7g\2\2"+
		"\u0288\u0289\7f\2\2\u0289\u028a\7U\2\2\u028a\u028b\7k\2\2\u028b\u028c"+
		"\7|\2\2\u028c\u028d\7g\2\2\u028d\u009a\3\2\2\2\u028e\u0290\t\2\2\2\u028f"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u009c\3\2\2\2\u0293\u0294\t\3\2\2\u0294\u009e\3\2\2\2\u0295"+
		"\u0296\t\4\2\2\u0296\u00a0\3\2\2\2\u0297\u0298\t\2\2\2\u0298\u00a2\3\2"+
		"\2\2\u0299\u029d\5\u009dO\2\u029a\u029c\5\u009fP\2\u029b\u029a\3\2\2\2"+
		"\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u00a4"+
		"\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\t\5\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2"+
		"\2\2\u02a5\u02a6\bS\2\2\u02a6\u00a6\3\2\2\2\u02a7\u02a8\7\61\2\2\u02a8"+
		"\u02a9\7,\2\2\u02a9\u02ad\3\2\2\2\u02aa\u02ac\13\2\2\2\u02ab\u02aa\3\2"+
		"\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7,\2\2\u02b1\u02b2\7\61"+
		"\2\2\u02b2\u00a8\3\2\2\2\u02b3\u02b4\7\61\2\2\u02b4\u02b5\7\61\2\2\u02b5"+
		"\u02b9\3\2\2\2\u02b6\u02b8\n\6\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u00aa\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\b\2\u0291\u029d\u02a3\u02ad\u02b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}