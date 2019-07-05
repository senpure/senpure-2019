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
		T__24=25, T__25=26, T__26=27, ABSTRACT=28, ASSERT=29, BOOLEAN=30, BREAK=31, 
		BYTE=32, CASE=33, CATCH=34, CHAR=35, CLASS=36, CONST=37, CONTINUE=38, 
		DEFAULT=39, DO=40, DOUBLE=41, ELSE=42, ENUM=43, EXTENDS=44, FINAL=45, 
		FINALLY=46, FLOAT=47, FOR=48, IF=49, GOTO=50, IMPLEMENTS=51, IMPORT=52, 
		INSTANCEOF=53, INT=54, INTERFACE=55, LONG=56, NATIVE=57, NEW=58, PACKAGE=59, 
		PRIVATE=60, PROTECTED=61, PUBLIC=62, RETURN=63, SHORT=64, STATIC=65, STRICTFP=66, 
		SUPER=67, SWITCH=68, SYNCHRONIZED=69, THIS=70, THROW=71, THROWS=72, TRANSIENT=73, 
		TRY=74, VOID=75, VOLATILE=76, WHILE=77, SELF=78, MESSAGEID=79, EVENTID=80, 
		SERIALIZEDSIZE=81, Number=82, Identifier=83, WS=84, COMMENT=85, LINE_COMMENT=86, 
		CODE_COMMENT=87;
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
			"T__25", "T__26", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
			"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", 
			"GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", 
			"THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "SELF", 
			"MESSAGEID", "EVENTID", "SERIALIZEDSIZE", "Number", "Letter", "LetterOrDigit", 
			"DIGIT", "Identifier", "WS", "COMMENT", "LINE_COMMENT", "CODE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'io'", "'javaPack'", "'namespace'", "'cs'", "'CS'", 
			"'sc'", "'SC'", "'bean'", "'message'", "'event'", "'-'", "'../'", "'/'", 
			"'\\'", "'{'", "'}'", "'='", "'['", "']'", "'sint'", "'slong'", "'sfixed32'", 
			"'sfixed64'", "'String'", "'string'", "'abstract'", "'assert'", "'boolean'", 
			"'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", 
			"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", 
			"'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", 
			"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
			"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
			"'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", 
			"'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", "'self'", "'messageId'", "'eventId'", "'serializedSize'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
			"CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", 
			"DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
			"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
			"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
			"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
			"SELF", "MESSAGEID", "EVENTID", "SERIALIZEDSIZE", "Number", "Identifier", 
			"WS", "COMMENT", "LINE_COMMENT", "CODE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u02e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3S\6S\u02aa\nS\rS\16S\u02ab\3T\3T\3U\3U\3V\3V\3W\3W\7W\u02b6"+
		"\nW\fW\16W\u02b9\13W\3X\6X\u02bc\nX\rX\16X\u02bd\3X\3X\3Y\3Y\3Y\3Y\7Y"+
		"\u02c6\nY\fY\16Y\u02c9\13Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u02d4\nZ\fZ\16"+
		"Z\u02d7\13Z\3[\3[\7[\u02db\n[\f[\16[\u02de\13[\3[\3[\3\u02c7\2\\\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7\2\u00a9\2\u00ab\2\u00adU\u00afV\u00b1W\u00b3X\u00b5Y\3"+
		"\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\2\u02e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
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
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\3\u00b7\3\2\2\2\5\u00b9\3\2\2\2\7\u00bb\3\2\2\2\t\u00be\3\2\2\2\13"+
		"\u00c7\3\2\2\2\r\u00d1\3\2\2\2\17\u00d4\3\2\2\2\21\u00d7\3\2\2\2\23\u00da"+
		"\3\2\2\2\25\u00dd\3\2\2\2\27\u00e2\3\2\2\2\31\u00ea\3\2\2\2\33\u00f0\3"+
		"\2\2\2\35\u00f2\3\2\2\2\37\u00f6\3\2\2\2!\u00f8\3\2\2\2#\u00fa\3\2\2\2"+
		"%\u00fc\3\2\2\2\'\u00fe\3\2\2\2)\u0100\3\2\2\2+\u0102\3\2\2\2-\u0104\3"+
		"\2\2\2/\u0109\3\2\2\2\61\u010f\3\2\2\2\63\u0118\3\2\2\2\65\u0121\3\2\2"+
		"\2\67\u0128\3\2\2\29\u012f\3\2\2\2;\u0138\3\2\2\2=\u013f\3\2\2\2?\u0147"+
		"\3\2\2\2A\u014d\3\2\2\2C\u0152\3\2\2\2E\u0157\3\2\2\2G\u015d\3\2\2\2I"+
		"\u0162\3\2\2\2K\u0168\3\2\2\2M\u016e\3\2\2\2O\u0177\3\2\2\2Q\u017f\3\2"+
		"\2\2S\u0182\3\2\2\2U\u0189\3\2\2\2W\u018e\3\2\2\2Y\u0193\3\2\2\2[\u019b"+
		"\3\2\2\2]\u01a1\3\2\2\2_\u01a9\3\2\2\2a\u01af\3\2\2\2c\u01b3\3\2\2\2e"+
		"\u01b6\3\2\2\2g\u01bb\3\2\2\2i\u01c6\3\2\2\2k\u01cd\3\2\2\2m\u01d8\3\2"+
		"\2\2o\u01dc\3\2\2\2q\u01e6\3\2\2\2s\u01eb\3\2\2\2u\u01f2\3\2\2\2w\u01f6"+
		"\3\2\2\2y\u01fe\3\2\2\2{\u0206\3\2\2\2}\u0210\3\2\2\2\177\u0217\3\2\2"+
		"\2\u0081\u021e\3\2\2\2\u0083\u0224\3\2\2\2\u0085\u022b\3\2\2\2\u0087\u0234"+
		"\3\2\2\2\u0089\u023a\3\2\2\2\u008b\u0241\3\2\2\2\u008d\u024e\3\2\2\2\u008f"+
		"\u0253\3\2\2\2\u0091\u0259\3\2\2\2\u0093\u0260\3\2\2\2\u0095\u026a\3\2"+
		"\2\2\u0097\u026e\3\2\2\2\u0099\u0273\3\2\2\2\u009b\u027c\3\2\2\2\u009d"+
		"\u0282\3\2\2\2\u009f\u0287\3\2\2\2\u00a1\u0291\3\2\2\2\u00a3\u0299\3\2"+
		"\2\2\u00a5\u02a9\3\2\2\2\u00a7\u02ad\3\2\2\2\u00a9\u02af\3\2\2\2\u00ab"+
		"\u02b1\3\2\2\2\u00ad\u02b3\3\2\2\2\u00af\u02bb\3\2\2\2\u00b1\u02c1\3\2"+
		"\2\2\u00b3\u02cf\3\2\2\2\u00b5\u02d8\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8"+
		"\4\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7l\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7x\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4\7c\2\2"+
		"\u00c4\u00c5\7e\2\2\u00c5\u00c6\7m\2\2\u00c6\n\3\2\2\2\u00c7\u00c8\7p"+
		"\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\f\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\16\3\2\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7U\2\2\u00d6\20\3\2\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\u00d9\7e\2\2\u00d9\22\3\2\2\2\u00da\u00db\7U\2\2\u00db"+
		"\u00dc\7E\2\2\u00dc\24\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\26\3\2\2\2\u00e2\u00e3\7o\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7\u00e8\7i\2\2\u00e8\u00e9\7g\2\2\u00e9\30\3\2\2\2\u00ea\u00eb\7"+
		"g\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\32\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1\34\3\2\2\2\u00f2\u00f3"+
		"\7\60\2\2\u00f3\u00f4\7\60\2\2\u00f4\u00f5\7\61\2\2\u00f5\36\3\2\2\2\u00f6"+
		"\u00f7\7\61\2\2\u00f7 \3\2\2\2\u00f8\u00f9\7^\2\2\u00f9\"\3\2\2\2\u00fa"+
		"\u00fb\7}\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fd&\3\2\2\2\u00fe"+
		"\u00ff\7?\2\2\u00ff(\3\2\2\2\u0100\u0101\7]\2\2\u0101*\3\2\2\2\u0102\u0103"+
		"\7_\2\2\u0103,\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7k\2\2\u0106\u0107"+
		"\7p\2\2\u0107\u0108\7v\2\2\u0108.\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b"+
		"\7n\2\2\u010b\u010c\7q\2\2\u010c\u010d\7p\2\2\u010d\u010e\7i\2\2\u010e"+
		"\60\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7h\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7z\2\2\u0113\u0114\7g\2\2\u0114\u0115\7f\2\2\u0115\u0116\7\65\2"+
		"\2\u0116\u0117\7\64\2\2\u0117\62\3\2\2\2\u0118\u0119\7u\2\2\u0119\u011a"+
		"\7h\2\2\u011a\u011b\7k\2\2\u011b\u011c\7z\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7f\2\2\u011e\u011f\78\2\2\u011f\u0120\7\66\2\2\u0120\64\3\2\2\2"+
		"\u0121\u0122\7U\2\2\u0122\u0123\7v\2\2\u0123\u0124\7t\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7p\2\2\u0126\u0127\7i\2\2\u0127\66\3\2\2\2\u0128\u0129"+
		"\7u\2\2\u0129\u012a\7v\2\2\u012a\u012b\7t\2\2\u012b\u012c\7k\2\2\u012c"+
		"\u012d\7p\2\2\u012d\u012e\7i\2\2\u012e8\3\2\2\2\u012f\u0130\7c\2\2\u0130"+
		"\u0131\7d\2\2\u0131\u0132\7u\2\2\u0132\u0133\7v\2\2\u0133\u0134\7t\2\2"+
		"\u0134\u0135\7c\2\2\u0135\u0136\7e\2\2\u0136\u0137\7v\2\2\u0137:\3\2\2"+
		"\2\u0138\u0139\7c\2\2\u0139\u013a\7u\2\2\u013a\u013b\7u\2\2\u013b\u013c"+
		"\7g\2\2\u013c\u013d\7t\2\2\u013d\u013e\7v\2\2\u013e<\3\2\2\2\u013f\u0140"+
		"\7d\2\2\u0140\u0141\7q\2\2\u0141\u0142\7q\2\2\u0142\u0143\7n\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7c\2\2\u0145\u0146\7p\2\2\u0146>\3\2\2\2\u0147"+
		"\u0148\7d\2\2\u0148\u0149\7t\2\2\u0149\u014a\7g\2\2\u014a\u014b\7c\2\2"+
		"\u014b\u014c\7m\2\2\u014c@\3\2\2\2\u014d\u014e\7d\2\2\u014e\u014f\7{\2"+
		"\2\u014f\u0150\7v\2\2\u0150\u0151\7g\2\2\u0151B\3\2\2\2\u0152\u0153\7"+
		"e\2\2\u0153\u0154\7c\2\2\u0154\u0155\7u\2\2\u0155\u0156\7g\2\2\u0156D"+
		"\3\2\2\2\u0157\u0158\7e\2\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a"+
		"\u015b\7e\2\2\u015b\u015c\7j\2\2\u015cF\3\2\2\2\u015d\u015e\7e\2\2\u015e"+
		"\u015f\7j\2\2\u015f\u0160\7c\2\2\u0160\u0161\7t\2\2\u0161H\3\2\2\2\u0162"+
		"\u0163\7e\2\2\u0163\u0164\7n\2\2\u0164\u0165\7c\2\2\u0165\u0166\7u\2\2"+
		"\u0166\u0167\7u\2\2\u0167J\3\2\2\2\u0168\u0169\7e\2\2\u0169\u016a\7q\2"+
		"\2\u016a\u016b\7p\2\2\u016b\u016c\7u\2\2\u016c\u016d\7v\2\2\u016dL\3\2"+
		"\2\2\u016e\u016f\7e\2\2\u016f\u0170\7q\2\2\u0170\u0171\7p\2\2\u0171\u0172"+
		"\7v\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174\u0175\7w\2\2\u0175"+
		"\u0176\7g\2\2\u0176N\3\2\2\2\u0177\u0178\7f\2\2\u0178\u0179\7g\2\2\u0179"+
		"\u017a\7h\2\2\u017a\u017b\7c\2\2\u017b\u017c\7w\2\2\u017c\u017d\7n\2\2"+
		"\u017d\u017e\7v\2\2\u017eP\3\2\2\2\u017f\u0180\7f\2\2\u0180\u0181\7q\2"+
		"\2\u0181R\3\2\2\2\u0182\u0183\7f\2\2\u0183\u0184\7q\2\2\u0184\u0185\7"+
		"w\2\2\u0185\u0186\7d\2\2\u0186\u0187\7n\2\2\u0187\u0188\7g\2\2\u0188T"+
		"\3\2\2\2\u0189\u018a\7g\2\2\u018a\u018b\7n\2\2\u018b\u018c\7u\2\2\u018c"+
		"\u018d\7g\2\2\u018dV\3\2\2\2\u018e\u018f\7g\2\2\u018f\u0190\7p\2\2\u0190"+
		"\u0191\7w\2\2\u0191\u0192\7o\2\2\u0192X\3\2\2\2\u0193\u0194\7g\2\2\u0194"+
		"\u0195\7z\2\2\u0195\u0196\7v\2\2\u0196\u0197\7g\2\2\u0197\u0198\7p\2\2"+
		"\u0198\u0199\7f\2\2\u0199\u019a\7u\2\2\u019aZ\3\2\2\2\u019b\u019c\7h\2"+
		"\2\u019c\u019d\7k\2\2\u019d\u019e\7p\2\2\u019e\u019f\7c\2\2\u019f\u01a0"+
		"\7n\2\2\u01a0\\\3\2\2\2\u01a1\u01a2\7h\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4"+
		"\7p\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7n\2\2\u01a7"+
		"\u01a8\7{\2\2\u01a8^\3\2\2\2\u01a9\u01aa\7h\2\2\u01aa\u01ab\7n\2\2\u01ab"+
		"\u01ac\7q\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7v\2\2\u01ae`\3\2\2\2\u01af"+
		"\u01b0\7h\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7t\2\2\u01b2b\3\2\2\2\u01b3"+
		"\u01b4\7k\2\2\u01b4\u01b5\7h\2\2\u01b5d\3\2\2\2\u01b6\u01b7\7i\2\2\u01b7"+
		"\u01b8\7q\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7q\2\2\u01baf\3\2\2\2\u01bb"+
		"\u01bc\7k\2\2\u01bc\u01bd\7o\2\2\u01bd\u01be\7r\2\2\u01be\u01bf\7n\2\2"+
		"\u01bf\u01c0\7g\2\2\u01c0\u01c1\7o\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3"+
		"\7p\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7u\2\2\u01c5h\3\2\2\2\u01c6\u01c7"+
		"\7k\2\2\u01c7\u01c8\7o\2\2\u01c8\u01c9\7r\2\2\u01c9\u01ca\7q\2\2\u01ca"+
		"\u01cb\7t\2\2\u01cb\u01cc\7v\2\2\u01ccj\3\2\2\2\u01cd\u01ce\7k\2\2\u01ce"+
		"\u01cf\7p\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7c\2\2"+
		"\u01d2\u01d3\7p\2\2\u01d3\u01d4\7e\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6"+
		"\7q\2\2\u01d6\u01d7\7h\2\2\u01d7l\3\2\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da"+
		"\7p\2\2\u01da\u01db\7v\2\2\u01dbn\3\2\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de"+
		"\7p\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7t\2\2\u01e1"+
		"\u01e2\7h\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7e\2\2\u01e4\u01e5\7g\2\2"+
		"\u01e5p\3\2\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7p\2"+
		"\2\u01e9\u01ea\7i\2\2\u01ear\3\2\2\2\u01eb\u01ec\7p\2\2\u01ec\u01ed\7"+
		"c\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7x\2\2\u01f0\u01f1"+
		"\7g\2\2\u01f1t\3\2\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5"+
		"\7y\2\2\u01f5v\3\2\2\2\u01f6\u01f7\7r\2\2\u01f7\u01f8\7c\2\2\u01f8\u01f9"+
		"\7e\2\2\u01f9\u01fa\7m\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc\7i\2\2\u01fc"+
		"\u01fd\7g\2\2\u01fdx\3\2\2\2\u01fe\u01ff\7r\2\2\u01ff\u0200\7t\2\2\u0200"+
		"\u0201\7k\2\2\u0201\u0202\7x\2\2\u0202\u0203\7c\2\2\u0203\u0204\7v\2\2"+
		"\u0204\u0205\7g\2\2\u0205z\3\2\2\2\u0206\u0207\7r\2\2\u0207\u0208\7t\2"+
		"\2\u0208\u0209\7q\2\2\u0209\u020a\7v\2\2\u020a\u020b\7g\2\2\u020b\u020c"+
		"\7e\2\2\u020c\u020d\7v\2\2\u020d\u020e\7g\2\2\u020e\u020f\7f\2\2\u020f"+
		"|\3\2\2\2\u0210\u0211\7r\2\2\u0211\u0212\7w\2\2\u0212\u0213\7d\2\2\u0213"+
		"\u0214\7n\2\2\u0214\u0215\7k\2\2\u0215\u0216\7e\2\2\u0216~\3\2\2\2\u0217"+
		"\u0218\7t\2\2\u0218\u0219\7g\2\2\u0219\u021a\7v\2\2\u021a\u021b\7w\2\2"+
		"\u021b\u021c\7t\2\2\u021c\u021d\7p\2\2\u021d\u0080\3\2\2\2\u021e\u021f"+
		"\7u\2\2\u021f\u0220\7j\2\2\u0220\u0221\7q\2\2\u0221\u0222\7t\2\2\u0222"+
		"\u0223\7v\2\2\u0223\u0082\3\2\2\2\u0224\u0225\7u\2\2\u0225\u0226\7v\2"+
		"\2\u0226\u0227\7c\2\2\u0227\u0228\7v\2\2\u0228\u0229\7k\2\2\u0229\u022a"+
		"\7e\2\2\u022a\u0084\3\2\2\2\u022b\u022c\7u\2\2\u022c\u022d\7v\2\2\u022d"+
		"\u022e\7t\2\2\u022e\u022f\7k\2\2\u022f\u0230\7e\2\2\u0230\u0231\7v\2\2"+
		"\u0231\u0232\7h\2\2\u0232\u0233\7r\2\2\u0233\u0086\3\2\2\2\u0234\u0235"+
		"\7u\2\2\u0235\u0236\7w\2\2\u0236\u0237\7r\2\2\u0237\u0238\7g\2\2\u0238"+
		"\u0239\7t\2\2\u0239\u0088\3\2\2\2\u023a\u023b\7u\2\2\u023b\u023c\7y\2"+
		"\2\u023c\u023d\7k\2\2\u023d\u023e\7v\2\2\u023e\u023f\7e\2\2\u023f\u0240"+
		"\7j\2\2\u0240\u008a\3\2\2\2\u0241\u0242\7u\2\2\u0242\u0243\7{\2\2\u0243"+
		"\u0244\7p\2\2\u0244\u0245\7e\2\2\u0245\u0246\7j\2\2\u0246\u0247\7t\2\2"+
		"\u0247\u0248\7q\2\2\u0248\u0249\7p\2\2\u0249\u024a\7k\2\2\u024a\u024b"+
		"\7|\2\2\u024b\u024c\7g\2\2\u024c\u024d\7f\2\2\u024d\u008c\3\2\2\2\u024e"+
		"\u024f\7v\2\2\u024f\u0250\7j\2\2\u0250\u0251\7k\2\2\u0251\u0252\7u\2\2"+
		"\u0252\u008e\3\2\2\2\u0253\u0254\7v\2\2\u0254\u0255\7j\2\2\u0255\u0256"+
		"\7t\2\2\u0256\u0257\7q\2\2\u0257\u0258\7y\2\2\u0258\u0090\3\2\2\2\u0259"+
		"\u025a\7v\2\2\u025a\u025b\7j\2\2\u025b\u025c\7t\2\2\u025c\u025d\7q\2\2"+
		"\u025d\u025e\7y\2\2\u025e\u025f\7u\2\2\u025f\u0092\3\2\2\2\u0260\u0261"+
		"\7v\2\2\u0261\u0262\7t\2\2\u0262\u0263\7c\2\2\u0263\u0264\7p\2\2\u0264"+
		"\u0265\7u\2\2\u0265\u0266\7k\2\2\u0266\u0267\7g\2\2\u0267\u0268\7p\2\2"+
		"\u0268\u0269\7v\2\2\u0269\u0094\3\2\2\2\u026a\u026b\7v\2\2\u026b\u026c"+
		"\7t\2\2\u026c\u026d\7{\2\2\u026d\u0096\3\2\2\2\u026e\u026f\7x\2\2\u026f"+
		"\u0270\7q\2\2\u0270\u0271\7k\2\2\u0271\u0272\7f\2\2\u0272\u0098\3\2\2"+
		"\2\u0273\u0274\7x\2\2\u0274\u0275\7q\2\2\u0275\u0276\7n\2\2\u0276\u0277"+
		"\7c\2\2\u0277\u0278\7v\2\2\u0278\u0279\7k\2\2\u0279\u027a\7n\2\2\u027a"+
		"\u027b\7g\2\2\u027b\u009a\3\2\2\2\u027c\u027d\7y\2\2\u027d\u027e\7j\2"+
		"\2\u027e\u027f\7k\2\2\u027f\u0280\7n\2\2\u0280\u0281\7g\2\2\u0281\u009c"+
		"\3\2\2\2\u0282\u0283\7u\2\2\u0283\u0284\7g\2\2\u0284\u0285\7n\2\2\u0285"+
		"\u0286\7h\2\2\u0286\u009e\3\2\2\2\u0287\u0288\7o\2\2\u0288\u0289\7g\2"+
		"\2\u0289\u028a\7u\2\2\u028a\u028b\7u\2\2\u028b\u028c\7c\2\2\u028c\u028d"+
		"\7i\2\2\u028d\u028e\7g\2\2\u028e\u028f\7K\2\2\u028f\u0290\7f\2\2\u0290"+
		"\u00a0\3\2\2\2\u0291\u0292\7g\2\2\u0292\u0293\7x\2\2\u0293\u0294\7g\2"+
		"\2\u0294\u0295\7p\2\2\u0295\u0296\7v\2\2\u0296\u0297\7K\2\2\u0297\u0298"+
		"\7f\2\2\u0298\u00a2\3\2\2\2\u0299\u029a\7u\2\2\u029a\u029b\7g\2\2\u029b"+
		"\u029c\7t\2\2\u029c\u029d\7k\2\2\u029d\u029e\7c\2\2\u029e\u029f\7n\2\2"+
		"\u029f\u02a0\7k\2\2\u02a0\u02a1\7|\2\2\u02a1\u02a2\7g\2\2\u02a2\u02a3"+
		"\7f\2\2\u02a3\u02a4\7U\2\2\u02a4\u02a5\7k\2\2\u02a5\u02a6\7|\2\2\u02a6"+
		"\u02a7\7g\2\2\u02a7\u00a4\3\2\2\2\u02a8\u02aa\t\2\2\2\u02a9\u02a8\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u00a6\3\2\2\2\u02ad\u02ae\t\3\2\2\u02ae\u00a8\3\2\2\2\u02af\u02b0\t\4"+
		"\2\2\u02b0\u00aa\3\2\2\2\u02b1\u02b2\t\2\2\2\u02b2\u00ac\3\2\2\2\u02b3"+
		"\u02b7\5\u00a7T\2\u02b4\u02b6\5\u00a9U\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9"+
		"\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u00ae\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bc\t\5\2\2\u02bb\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c0\bX\2\2\u02c0\u00b0\3\2\2\2\u02c1\u02c2\7\61\2\2\u02c2\u02c3\7,"+
		"\2\2\u02c3\u02c7\3\2\2\2\u02c4\u02c6\13\2\2\2\u02c5\u02c4\3\2\2\2\u02c6"+
		"\u02c9\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02ca\3\2"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7,\2\2\u02cb\u02cc\7\61\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\bY\2\2\u02ce\u00b2\3\2\2\2\u02cf\u02d0\7\61"+
		"\2\2\u02d0\u02d1\7\61\2\2\u02d1\u02d5\3\2\2\2\u02d2\u02d4\n\6\2\2\u02d3"+
		"\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u00b4\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02dc\7%\2\2\u02d9"+
		"\u02db\n\6\2\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df"+
		"\u02e0\b[\2\2\u02e0\u00b6\3\2\2\2\t\2\u02ab\u02b7\u02bd\u02c7\u02d5\u02dc"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}