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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ABSTRACT=27, ASSERT=28, BOOLEAN=29, BREAK=30, BYTE=31, 
		CASE=32, CATCH=33, CHAR=34, CLASS=35, CONST=36, CONTINUE=37, DEFAULT=38, 
		DO=39, DOUBLE=40, ELSE=41, ENUM=42, EXTENDS=43, FINAL=44, FINALLY=45, 
		FLOAT=46, FOR=47, IF=48, GOTO=49, IMPLEMENTS=50, IMPORT=51, INSTANCEOF=52, 
		INT=53, INTERFACE=54, LONG=55, NATIVE=56, NEW=57, PACKAGE=58, PRIVATE=59, 
		PROTECTED=60, PUBLIC=61, RETURN=62, SHORT=63, STATIC=64, STRICTFP=65, 
		SUPER=66, SWITCH=67, SYNCHRONIZED=68, THIS=69, THROW=70, THROWS=71, TRANSIENT=72, 
		TRY=73, VOID=74, VOLATILE=75, WHILE=76, SELF=77, MESSAGEID=78, EVENTID=79, 
		SERIALIZEDSIZE=80, Number=81, Identifier=82, WS=83, COMMENT=84, LINE_COMMENT=85, 
		CODE_COMMENT=86;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "SELF", "MESSAGEID", 
			"EVENTID", "SERIALIZEDSIZE", "Number", "Letter", "LetterOrDigit", "DIGIT", 
			"Identifier", "WS", "COMMENT", "LINE_COMMENT", "CODE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.io'", "'javaPack'", "'.'", "'namespace'", "'../'", "'/'", 
			"'\\'", "'{'", "'}'", "'message'", "'cs'", "'CS'", "'sc'", "'SC'", "'event'", 
			"'bean'", "'='", "'['", "']'", "'sint'", "'slong'", "'sfixed32'", "'sfixed64'", 
			"'String'", "'string'", "'abstract'", "'assert'", "'boolean'", "'break'", 
			"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
			"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
			"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
			"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
			"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
			"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", "'self'", "'messageId'", "'eventId'", "'serializedSize'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "SELF", 
			"MESSAGEID", "EVENTID", "SERIALIZEDSIZE", "Number", "Identifier", "WS", 
			"COMMENT", "LINE_COMMENT", "CODE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u02de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>"+
		"\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3K"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\6R\u02a7\nR\rR\16R\u02a8\3S\3S\3T\3T\3U\3U\3"+
		"V\3V\7V\u02b3\nV\fV\16V\u02b6\13V\3W\6W\u02b9\nW\rW\16W\u02ba\3W\3W\3"+
		"X\3X\3X\3X\7X\u02c3\nX\fX\16X\u02c6\13X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\7Y"+
		"\u02d1\nY\fY\16Y\u02d4\13Y\3Z\3Z\7Z\u02d8\nZ\fZ\16Z\u02db\13Z\3Z\3Z\3"+
		"\u02c4\2[\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5\2\u00a7\2\u00a9\2\u00abT\u00adU\u00afV\u00b1W\u00b3"+
		"X\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u02e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
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
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\3\u00b5\3\2\2"+
		"\2\5\u00b7\3\2\2\2\7\u00bb\3\2\2\2\t\u00c4\3\2\2\2\13\u00c6\3\2\2\2\r"+
		"\u00d0\3\2\2\2\17\u00d4\3\2\2\2\21\u00d6\3\2\2\2\23\u00d8\3\2\2\2\25\u00da"+
		"\3\2\2\2\27\u00dc\3\2\2\2\31\u00e4\3\2\2\2\33\u00e7\3\2\2\2\35\u00ea\3"+
		"\2\2\2\37\u00ed\3\2\2\2!\u00f0\3\2\2\2#\u00f6\3\2\2\2%\u00fb\3\2\2\2\'"+
		"\u00fd\3\2\2\2)\u00ff\3\2\2\2+\u0101\3\2\2\2-\u0106\3\2\2\2/\u010c\3\2"+
		"\2\2\61\u0115\3\2\2\2\63\u011e\3\2\2\2\65\u0125\3\2\2\2\67\u012c\3\2\2"+
		"\29\u0135\3\2\2\2;\u013c\3\2\2\2=\u0144\3\2\2\2?\u014a\3\2\2\2A\u014f"+
		"\3\2\2\2C\u0154\3\2\2\2E\u015a\3\2\2\2G\u015f\3\2\2\2I\u0165\3\2\2\2K"+
		"\u016b\3\2\2\2M\u0174\3\2\2\2O\u017c\3\2\2\2Q\u017f\3\2\2\2S\u0186\3\2"+
		"\2\2U\u018b\3\2\2\2W\u0190\3\2\2\2Y\u0198\3\2\2\2[\u019e\3\2\2\2]\u01a6"+
		"\3\2\2\2_\u01ac\3\2\2\2a\u01b0\3\2\2\2c\u01b3\3\2\2\2e\u01b8\3\2\2\2g"+
		"\u01c3\3\2\2\2i\u01ca\3\2\2\2k\u01d5\3\2\2\2m\u01d9\3\2\2\2o\u01e3\3\2"+
		"\2\2q\u01e8\3\2\2\2s\u01ef\3\2\2\2u\u01f3\3\2\2\2w\u01fb\3\2\2\2y\u0203"+
		"\3\2\2\2{\u020d\3\2\2\2}\u0214\3\2\2\2\177\u021b\3\2\2\2\u0081\u0221\3"+
		"\2\2\2\u0083\u0228\3\2\2\2\u0085\u0231\3\2\2\2\u0087\u0237\3\2\2\2\u0089"+
		"\u023e\3\2\2\2\u008b\u024b\3\2\2\2\u008d\u0250\3\2\2\2\u008f\u0256\3\2"+
		"\2\2\u0091\u025d\3\2\2\2\u0093\u0267\3\2\2\2\u0095\u026b\3\2\2\2\u0097"+
		"\u0270\3\2\2\2\u0099\u0279\3\2\2\2\u009b\u027f\3\2\2\2\u009d\u0284\3\2"+
		"\2\2\u009f\u028e\3\2\2\2\u00a1\u0296\3\2\2\2\u00a3\u02a6\3\2\2\2\u00a5"+
		"\u02aa\3\2\2\2\u00a7\u02ac\3\2\2\2\u00a9\u02ae\3\2\2\2\u00ab\u02b0\3\2"+
		"\2\2\u00ad\u02b8\3\2\2\2\u00af\u02be\3\2\2\2\u00b1\u02cc\3\2\2\2\u00b3"+
		"\u02d5\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6\4\3\2\2\2\u00b7\u00b8\7\60\2\2"+
		"\u00b8\u00b9\7k\2\2\u00b9\u00ba\7q\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7l"+
		"\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7R\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7m\2\2\u00c3"+
		"\b\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5\n\3\2\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7u\2\2"+
		"\u00cb\u00cc\7r\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\f\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7\60\2\2\u00d2"+
		"\u00d3\7\61\2\2\u00d3\16\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\20\3\2\2\2"+
		"\u00d6\u00d7\7^\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\7}\2\2\u00d9\24\3\2\2"+
		"\2\u00da\u00db\7\177\2\2\u00db\26\3\2\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7i\2\2\u00e2\u00e3\7g\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\32\3\2\2\2\u00e7\u00e8\7E\2\2\u00e8\u00e9\7U\2\2\u00e9"+
		"\34\3\2\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7e\2\2\u00ec\36\3\2\2\2\u00ed"+
		"\u00ee\7U\2\2\u00ee\u00ef\7E\2\2\u00ef \3\2\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7x\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5\"\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7c"+
		"\2\2\u00f9\u00fa\7p\2\2\u00fa$\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc&\3\2\2"+
		"\2\u00fd\u00fe\7]\2\2\u00fe(\3\2\2\2\u00ff\u0100\7_\2\2\u0100*\3\2\2\2"+
		"\u0101\u0102\7u\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7v\2\2\u0105,\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7n\2\2\u0108\u0109"+
		"\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7i\2\2\u010b.\3\2\2\2\u010c\u010d"+
		"\7u\2\2\u010d\u010e\7h\2\2\u010e\u010f\7k\2\2\u010f\u0110\7z\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7f\2\2\u0112\u0113\7\65\2\2\u0113\u0114\7\64"+
		"\2\2\u0114\60\3\2\2\2\u0115\u0116\7u\2\2\u0116\u0117\7h\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7z\2\2\u0119\u011a\7g\2\2\u011a\u011b\7f\2\2\u011b"+
		"\u011c\78\2\2\u011c\u011d\7\66\2\2\u011d\62\3\2\2\2\u011e\u011f\7U\2\2"+
		"\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121\u0122\7k\2\2\u0122\u0123"+
		"\7p\2\2\u0123\u0124\7i\2\2\u0124\64\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127"+
		"\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a"+
		"\u012b\7i\2\2\u012b\66\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e\7d\2\2\u012e"+
		"\u012f\7u\2\2\u012f\u0130\7v\2\2\u0130\u0131\7t\2\2\u0131\u0132\7c\2\2"+
		"\u0132\u0133\7e\2\2\u0133\u0134\7v\2\2\u01348\3\2\2\2\u0135\u0136\7c\2"+
		"\2\u0136\u0137\7u\2\2\u0137\u0138\7u\2\2\u0138\u0139\7g\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7v\2\2\u013b:\3\2\2\2\u013c\u013d\7d\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u013f\7q\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7c\2\2\u0142\u0143\7p\2\2\u0143<\3\2\2\2\u0144\u0145\7d\2\2\u0145"+
		"\u0146\7t\2\2\u0146\u0147\7g\2\2\u0147\u0148\7c\2\2\u0148\u0149\7m\2\2"+
		"\u0149>\3\2\2\2\u014a\u014b\7d\2\2\u014b\u014c\7{\2\2\u014c\u014d\7v\2"+
		"\2\u014d\u014e\7g\2\2\u014e@\3\2\2\2\u014f\u0150\7e\2\2\u0150\u0151\7"+
		"c\2\2\u0151\u0152\7u\2\2\u0152\u0153\7g\2\2\u0153B\3\2\2\2\u0154\u0155"+
		"\7e\2\2\u0155\u0156\7c\2\2\u0156\u0157\7v\2\2\u0157\u0158\7e\2\2\u0158"+
		"\u0159\7j\2\2\u0159D\3\2\2\2\u015a\u015b\7e\2\2\u015b\u015c\7j\2\2\u015c"+
		"\u015d\7c\2\2\u015d\u015e\7t\2\2\u015eF\3\2\2\2\u015f\u0160\7e\2\2\u0160"+
		"\u0161\7n\2\2\u0161\u0162\7c\2\2\u0162\u0163\7u\2\2\u0163\u0164\7u\2\2"+
		"\u0164H\3\2\2\2\u0165\u0166\7e\2\2\u0166\u0167\7q\2\2\u0167\u0168\7p\2"+
		"\2\u0168\u0169\7u\2\2\u0169\u016a\7v\2\2\u016aJ\3\2\2\2\u016b\u016c\7"+
		"e\2\2\u016c\u016d\7q\2\2\u016d\u016e\7p\2\2\u016e\u016f\7v\2\2\u016f\u0170"+
		"\7k\2\2\u0170\u0171\7p\2\2\u0171\u0172\7w\2\2\u0172\u0173\7g\2\2\u0173"+
		"L\3\2\2\2\u0174\u0175\7f\2\2\u0175\u0176\7g\2\2\u0176\u0177\7h\2\2\u0177"+
		"\u0178\7c\2\2\u0178\u0179\7w\2\2\u0179\u017a\7n\2\2\u017a\u017b\7v\2\2"+
		"\u017bN\3\2\2\2\u017c\u017d\7f\2\2\u017d\u017e\7q\2\2\u017eP\3\2\2\2\u017f"+
		"\u0180\7f\2\2\u0180\u0181\7q\2\2\u0181\u0182\7w\2\2\u0182\u0183\7d\2\2"+
		"\u0183\u0184\7n\2\2\u0184\u0185\7g\2\2\u0185R\3\2\2\2\u0186\u0187\7g\2"+
		"\2\u0187\u0188\7n\2\2\u0188\u0189\7u\2\2\u0189\u018a\7g\2\2\u018aT\3\2"+
		"\2\2\u018b\u018c\7g\2\2\u018c\u018d\7p\2\2\u018d\u018e\7w\2\2\u018e\u018f"+
		"\7o\2\2\u018fV\3\2\2\2\u0190\u0191\7g\2\2\u0191\u0192\7z\2\2\u0192\u0193"+
		"\7v\2\2\u0193\u0194\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196\7f\2\2\u0196"+
		"\u0197\7u\2\2\u0197X\3\2\2\2\u0198\u0199\7h\2\2\u0199\u019a\7k\2\2\u019a"+
		"\u019b\7p\2\2\u019b\u019c\7c\2\2\u019c\u019d\7n\2\2\u019dZ\3\2\2\2\u019e"+
		"\u019f\7h\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7c\2\2"+
		"\u01a2\u01a3\7n\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7{\2\2\u01a5\\\3\2"+
		"\2\2\u01a6\u01a7\7h\2\2\u01a7\u01a8\7n\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa"+
		"\7c\2\2\u01aa\u01ab\7v\2\2\u01ab^\3\2\2\2\u01ac\u01ad\7h\2\2\u01ad\u01ae"+
		"\7q\2\2\u01ae\u01af\7t\2\2\u01af`\3\2\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2"+
		"\7h\2\2\u01b2b\3\2\2\2\u01b3\u01b4\7i\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6"+
		"\7v\2\2\u01b6\u01b7\7q\2\2\u01b7d\3\2\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba"+
		"\7o\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7g\2\2\u01bd"+
		"\u01be\7o\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7v\2\2"+
		"\u01c1\u01c2\7u\2\2\u01c2f\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7o\2"+
		"\2\u01c5\u01c6\7r\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9"+
		"\7v\2\2\u01c9h\3\2\2\2\u01ca\u01cb\7k\2\2\u01cb\u01cc\7p\2\2\u01cc\u01cd"+
		"\7u\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7p\2\2\u01d0"+
		"\u01d1\7e\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7h\2\2"+
		"\u01d4j\3\2\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7v\2"+
		"\2\u01d8l\3\2\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7p\2\2\u01db\u01dc\7"+
		"v\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7h\2\2\u01df\u01e0"+
		"\7c\2\2\u01e0\u01e1\7e\2\2\u01e1\u01e2\7g\2\2\u01e2n\3\2\2\2\u01e3\u01e4"+
		"\7n\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6\7p\2\2\u01e6\u01e7\7i\2\2\u01e7"+
		"p\3\2\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7v\2\2\u01eb"+
		"\u01ec\7k\2\2\u01ec\u01ed\7x\2\2\u01ed\u01ee\7g\2\2\u01eer\3\2\2\2\u01ef"+
		"\u01f0\7p\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7y\2\2\u01f2t\3\2\2\2\u01f3"+
		"\u01f4\7r\2\2\u01f4\u01f5\7c\2\2\u01f5\u01f6\7e\2\2\u01f6\u01f7\7m\2\2"+
		"\u01f7\u01f8\7c\2\2\u01f8\u01f9\7i\2\2\u01f9\u01fa\7g\2\2\u01fav\3\2\2"+
		"\2\u01fb\u01fc\7r\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7k\2\2\u01fe\u01ff"+
		"\7x\2\2\u01ff\u0200\7c\2\2\u0200\u0201\7v\2\2\u0201\u0202\7g\2\2\u0202"+
		"x\3\2\2\2\u0203\u0204\7r\2\2\u0204\u0205\7t\2\2\u0205\u0206\7q\2\2\u0206"+
		"\u0207\7v\2\2\u0207\u0208\7g\2\2\u0208\u0209\7e\2\2\u0209\u020a\7v\2\2"+
		"\u020a\u020b\7g\2\2\u020b\u020c\7f\2\2\u020cz\3\2\2\2\u020d\u020e\7r\2"+
		"\2\u020e\u020f\7w\2\2\u020f\u0210\7d\2\2\u0210\u0211\7n\2\2\u0211\u0212"+
		"\7k\2\2\u0212\u0213\7e\2\2\u0213|\3\2\2\2\u0214\u0215\7t\2\2\u0215\u0216"+
		"\7g\2\2\u0216\u0217\7v\2\2\u0217\u0218\7w\2\2\u0218\u0219\7t\2\2\u0219"+
		"\u021a\7p\2\2\u021a~\3\2\2\2\u021b\u021c\7u\2\2\u021c\u021d\7j\2\2\u021d"+
		"\u021e\7q\2\2\u021e\u021f\7t\2\2\u021f\u0220\7v\2\2\u0220\u0080\3\2\2"+
		"\2\u0221\u0222\7u\2\2\u0222\u0223\7v\2\2\u0223\u0224\7c\2\2\u0224\u0225"+
		"\7v\2\2\u0225\u0226\7k\2\2\u0226\u0227\7e\2\2\u0227\u0082\3\2\2\2\u0228"+
		"\u0229\7u\2\2\u0229\u022a\7v\2\2\u022a\u022b\7t\2\2\u022b\u022c\7k\2\2"+
		"\u022c\u022d\7e\2\2\u022d\u022e\7v\2\2\u022e\u022f\7h\2\2\u022f\u0230"+
		"\7r\2\2\u0230\u0084\3\2\2\2\u0231\u0232\7u\2\2\u0232\u0233\7w\2\2\u0233"+
		"\u0234\7r\2\2\u0234\u0235\7g\2\2\u0235\u0236\7t\2\2\u0236\u0086\3\2\2"+
		"\2\u0237\u0238\7u\2\2\u0238\u0239\7y\2\2\u0239\u023a\7k\2\2\u023a\u023b"+
		"\7v\2\2\u023b\u023c\7e\2\2\u023c\u023d\7j\2\2\u023d\u0088\3\2\2\2\u023e"+
		"\u023f\7u\2\2\u023f\u0240\7{\2\2\u0240\u0241\7p\2\2\u0241\u0242\7e\2\2"+
		"\u0242\u0243\7j\2\2\u0243\u0244\7t\2\2\u0244\u0245\7q\2\2\u0245\u0246"+
		"\7p\2\2\u0246\u0247\7k\2\2\u0247\u0248\7|\2\2\u0248\u0249\7g\2\2\u0249"+
		"\u024a\7f\2\2\u024a\u008a\3\2\2\2\u024b\u024c\7v\2\2\u024c\u024d\7j\2"+
		"\2\u024d\u024e\7k\2\2\u024e\u024f\7u\2\2\u024f\u008c\3\2\2\2\u0250\u0251"+
		"\7v\2\2\u0251\u0252\7j\2\2\u0252\u0253\7t\2\2\u0253\u0254\7q\2\2\u0254"+
		"\u0255\7y\2\2\u0255\u008e\3\2\2\2\u0256\u0257\7v\2\2\u0257\u0258\7j\2"+
		"\2\u0258\u0259\7t\2\2\u0259\u025a\7q\2\2\u025a\u025b\7y\2\2\u025b\u025c"+
		"\7u\2\2\u025c\u0090\3\2\2\2\u025d\u025e\7v\2\2\u025e\u025f\7t\2\2\u025f"+
		"\u0260\7c\2\2\u0260\u0261\7p\2\2\u0261\u0262\7u\2\2\u0262\u0263\7k\2\2"+
		"\u0263\u0264\7g\2\2\u0264\u0265\7p\2\2\u0265\u0266\7v\2\2\u0266\u0092"+
		"\3\2\2\2\u0267\u0268\7v\2\2\u0268\u0269\7t\2\2\u0269\u026a\7{\2\2\u026a"+
		"\u0094\3\2\2\2\u026b\u026c\7x\2\2\u026c\u026d\7q\2\2\u026d\u026e\7k\2"+
		"\2\u026e\u026f\7f\2\2\u026f\u0096\3\2\2\2\u0270\u0271\7x\2\2\u0271\u0272"+
		"\7q\2\2\u0272\u0273\7n\2\2\u0273\u0274\7c\2\2\u0274\u0275\7v\2\2\u0275"+
		"\u0276\7k\2\2\u0276\u0277\7n\2\2\u0277\u0278\7g\2\2\u0278\u0098\3\2\2"+
		"\2\u0279\u027a\7y\2\2\u027a\u027b\7j\2\2\u027b\u027c\7k\2\2\u027c\u027d"+
		"\7n\2\2\u027d\u027e\7g\2\2\u027e\u009a\3\2\2\2\u027f\u0280\7u\2\2\u0280"+
		"\u0281\7g\2\2\u0281\u0282\7n\2\2\u0282\u0283\7h\2\2\u0283\u009c\3\2\2"+
		"\2\u0284\u0285\7o\2\2\u0285\u0286\7g\2\2\u0286\u0287\7u\2\2\u0287\u0288"+
		"\7u\2\2\u0288\u0289\7c\2\2\u0289\u028a\7i\2\2\u028a\u028b\7g\2\2\u028b"+
		"\u028c\7K\2\2\u028c\u028d\7f\2\2\u028d\u009e\3\2\2\2\u028e\u028f\7g\2"+
		"\2\u028f\u0290\7x\2\2\u0290\u0291\7g\2\2\u0291\u0292\7p\2\2\u0292\u0293"+
		"\7v\2\2\u0293\u0294\7K\2\2\u0294\u0295\7f\2\2\u0295\u00a0\3\2\2\2\u0296"+
		"\u0297\7u\2\2\u0297\u0298\7g\2\2\u0298\u0299\7t\2\2\u0299\u029a\7k\2\2"+
		"\u029a\u029b\7c\2\2\u029b\u029c\7n\2\2\u029c\u029d\7k\2\2\u029d\u029e"+
		"\7|\2\2\u029e\u029f\7g\2\2\u029f\u02a0\7f\2\2\u02a0\u02a1\7U\2\2\u02a1"+
		"\u02a2\7k\2\2\u02a2\u02a3\7|\2\2\u02a3\u02a4\7g\2\2\u02a4\u00a2\3\2\2"+
		"\2\u02a5\u02a7\t\2\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u00a4\3\2\2\2\u02aa\u02ab\t\3\2\2\u02ab"+
		"\u00a6\3\2\2\2\u02ac\u02ad\t\4\2\2\u02ad\u00a8\3\2\2\2\u02ae\u02af\t\2"+
		"\2\2\u02af\u00aa\3\2\2\2\u02b0\u02b4\5\u00a5S\2\u02b1\u02b3\5\u00a7T\2"+
		"\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u00ac\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b9\t\5\2\2\u02b8"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\bW\2\2\u02bd\u00ae\3\2\2\2\u02be"+
		"\u02bf\7\61\2\2\u02bf\u02c0\7,\2\2\u02c0\u02c4\3\2\2\2\u02c1\u02c3\13"+
		"\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\7,"+
		"\2\2\u02c8\u02c9\7\61\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\bX\2\2\u02cb"+
		"\u00b0\3\2\2\2\u02cc\u02cd\7\61\2\2\u02cd\u02ce\7\61\2\2\u02ce\u02d2\3"+
		"\2\2\2\u02cf\u02d1\n\6\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u00b2\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d5\u02d9\7%\2\2\u02d6\u02d8\n\6\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\bZ\2\2\u02dd\u00b4\3\2\2\2\t\2\u02a8"+
		"\u02b4\u02ba\u02c4\u02d2\u02d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}