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
		T__24=25, T__25=26, T__26=27, T__27=28, ABSTRACT=29, ASSERT=30, BOOLEAN=31, 
		BREAK=32, BYTE=33, CASE=34, CATCH=35, CHAR=36, CLASS=37, CONST=38, CONTINUE=39, 
		DEFAULT=40, DO=41, DOUBLE=42, ELSE=43, ENUM=44, EXTENDS=45, FINAL=46, 
		FINALLY=47, FLOAT=48, FOR=49, IF=50, GOTO=51, IMPLEMENTS=52, IMPORT=53, 
		INSTANCEOF=54, INT=55, INTERFACE=56, LONG=57, NATIVE=58, NEW=59, PACKAGE=60, 
		PRIVATE=61, PROTECTED=62, PUBLIC=63, RETURN=64, SHORT=65, STATIC=66, STRICTFP=67, 
		SUPER=68, SWITCH=69, SYNCHRONIZED=70, THIS=71, THROW=72, THROWS=73, TRANSIENT=74, 
		TRY=75, VOID=76, VOLATILE=77, WHILE=78, SELF=79, MESSAGEID=80, EVENTID=81, 
		SERIALIZEDSIZE=82, UNKNOWN=83, Number=84, Identifier=85, WS=86, COMMENT=87, 
		LINE_COMMENT=88, CODE_COMMENT=89;
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
			"T__25", "T__26", "T__27", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", 
			"BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
			"FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
			"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
			"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
			"SELF", "MESSAGEID", "EVENTID", "SERIALIZEDSIZE", "UNKNOWN", "Number", 
			"Letter", "LetterOrDigit", "DIGIT", "Identifier", "WS", "COMMENT", "LINE_COMMENT", 
			"CODE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'io'", "'javaPackage'", "'namespace'", "'luaNamespace'", 
			"'cs'", "'CS'", "'sc'", "'SC'", "'bean'", "'message'", "'event'", "'-'", 
			"'../'", "'/'", "'\\'", "'{'", "'}'", "'='", "'['", "']'", "'sint'", 
			"'slong'", "'sfixed32'", "'sfixed64'", "'String'", "'string'", "'abstract'", 
			"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
			"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
			"'else'", "'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", 
			"'if'", "'goto'", "'implements'", "'import'", "'instanceof'", "'int'", 
			"'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'self'", 
			"'messageId'", "'eventId'", "'serializedSize'", "'UNKNOWN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", 
			"BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
			"FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
			"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
			"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
			"SELF", "MESSAGEID", "EVENTID", "SERIALIZEDSIZE", "UNKNOWN", "Number", 
			"Identifier", "WS", "COMMENT", "LINE_COMMENT", "CODE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u02fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3"+
		"J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\6U\u02c6\nU\rU\16U\u02c7\3V\3V\3"+
		"W\3W\3X\3X\3Y\3Y\7Y\u02d2\nY\fY\16Y\u02d5\13Y\3Z\6Z\u02d8\nZ\rZ\16Z\u02d9"+
		"\3Z\3Z\3[\3[\3[\3[\7[\u02e2\n[\f[\16[\u02e5\13[\3[\3[\3[\3[\3[\3\\\3\\"+
		"\3\\\3\\\7\\\u02f0\n\\\f\\\16\\\u02f3\13\\\3]\3]\7]\u02f7\n]\f]\16]\u02fa"+
		"\13]\3]\3]\3\u02e3\2^\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"W\u00b3X\u00b5Y\u00b7Z\u00b9[\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|"+
		"\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u02ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\3\u00bb"+
		"\3\2\2\2\5\u00bd\3\2\2\2\7\u00bf\3\2\2\2\t\u00c2\3\2\2\2\13\u00ce\3\2"+
		"\2\2\r\u00d8\3\2\2\2\17\u00e5\3\2\2\2\21\u00e8\3\2\2\2\23\u00eb\3\2\2"+
		"\2\25\u00ee\3\2\2\2\27\u00f1\3\2\2\2\31\u00f6\3\2\2\2\33\u00fe\3\2\2\2"+
		"\35\u0104\3\2\2\2\37\u0106\3\2\2\2!\u010a\3\2\2\2#\u010c\3\2\2\2%\u010e"+
		"\3\2\2\2\'\u0110\3\2\2\2)\u0112\3\2\2\2+\u0114\3\2\2\2-\u0116\3\2\2\2"+
		"/\u0118\3\2\2\2\61\u011d\3\2\2\2\63\u0123\3\2\2\2\65\u012c\3\2\2\2\67"+
		"\u0135\3\2\2\29\u013c\3\2\2\2;\u0143\3\2\2\2=\u014c\3\2\2\2?\u0153\3\2"+
		"\2\2A\u015b\3\2\2\2C\u0161\3\2\2\2E\u0166\3\2\2\2G\u016b\3\2\2\2I\u0171"+
		"\3\2\2\2K\u0176\3\2\2\2M\u017c\3\2\2\2O\u0182\3\2\2\2Q\u018b\3\2\2\2S"+
		"\u0193\3\2\2\2U\u0196\3\2\2\2W\u019d\3\2\2\2Y\u01a2\3\2\2\2[\u01a7\3\2"+
		"\2\2]\u01af\3\2\2\2_\u01b5\3\2\2\2a\u01bd\3\2\2\2c\u01c3\3\2\2\2e\u01c7"+
		"\3\2\2\2g\u01ca\3\2\2\2i\u01cf\3\2\2\2k\u01da\3\2\2\2m\u01e1\3\2\2\2o"+
		"\u01ec\3\2\2\2q\u01f0\3\2\2\2s\u01fa\3\2\2\2u\u01ff\3\2\2\2w\u0206\3\2"+
		"\2\2y\u020a\3\2\2\2{\u0212\3\2\2\2}\u021a\3\2\2\2\177\u0224\3\2\2\2\u0081"+
		"\u022b\3\2\2\2\u0083\u0232\3\2\2\2\u0085\u0238\3\2\2\2\u0087\u023f\3\2"+
		"\2\2\u0089\u0248\3\2\2\2\u008b\u024e\3\2\2\2\u008d\u0255\3\2\2\2\u008f"+
		"\u0262\3\2\2\2\u0091\u0267\3\2\2\2\u0093\u026d\3\2\2\2\u0095\u0274\3\2"+
		"\2\2\u0097\u027e\3\2\2\2\u0099\u0282\3\2\2\2\u009b\u0287\3\2\2\2\u009d"+
		"\u0290\3\2\2\2\u009f\u0296\3\2\2\2\u00a1\u029b\3\2\2\2\u00a3\u02a5\3\2"+
		"\2\2\u00a5\u02ad\3\2\2\2\u00a7\u02bc\3\2\2\2\u00a9\u02c5\3\2\2\2\u00ab"+
		"\u02c9\3\2\2\2\u00ad\u02cb\3\2\2\2\u00af\u02cd\3\2\2\2\u00b1\u02cf\3\2"+
		"\2\2\u00b3\u02d7\3\2\2\2\u00b5\u02dd\3\2\2\2\u00b7\u02eb\3\2\2\2\u00b9"+
		"\u02f4\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc\4\3\2\2\2\u00bd\u00be\7\60\2\2"+
		"\u00be\6\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\b\3\2\2\2"+
		"\u00c2\u00c3\7l\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7R\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7m\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\n\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7o"+
		"\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5"+
		"\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7g\2\2\u00d7\f\3\2\2\2\u00d8\u00d9"+
		"\7n\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7P\2\2\u00dc"+
		"\u00dd\7c\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7u\2\2"+
		"\u00e0\u00e1\7r\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\16\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7u\2\2\u00e7\20"+
		"\3\2\2\2\u00e8\u00e9\7E\2\2\u00e9\u00ea\7U\2\2\u00ea\22\3\2\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7e\2\2\u00ed\24\3\2\2\2\u00ee\u00ef\7U\2\2\u00ef"+
		"\u00f0\7E\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7p\2\2\u00f5\30\3\2\2\2\u00f6\u00f7\7o\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7c\2\2"+
		"\u00fb\u00fc\7i\2\2\u00fc\u00fd\7g\2\2\u00fd\32\3\2\2\2\u00fe\u00ff\7"+
		"g\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7v\2\2\u0103\34\3\2\2\2\u0104\u0105\7/\2\2\u0105\36\3\2\2\2\u0106\u0107"+
		"\7\60\2\2\u0107\u0108\7\60\2\2\u0108\u0109\7\61\2\2\u0109 \3\2\2\2\u010a"+
		"\u010b\7\61\2\2\u010b\"\3\2\2\2\u010c\u010d\7^\2\2\u010d$\3\2\2\2\u010e"+
		"\u010f\7}\2\2\u010f&\3\2\2\2\u0110\u0111\7\177\2\2\u0111(\3\2\2\2\u0112"+
		"\u0113\7?\2\2\u0113*\3\2\2\2\u0114\u0115\7]\2\2\u0115,\3\2\2\2\u0116\u0117"+
		"\7_\2\2\u0117.\3\2\2\2\u0118\u0119\7u\2\2\u0119\u011a\7k\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7v\2\2\u011c\60\3\2\2\2\u011d\u011e\7u\2\2\u011e\u011f"+
		"\7n\2\2\u011f\u0120\7q\2\2\u0120\u0121\7p\2\2\u0121\u0122\7i\2\2\u0122"+
		"\62\3\2\2\2\u0123\u0124\7u\2\2\u0124\u0125\7h\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7z\2\2\u0127\u0128\7g\2\2\u0128\u0129\7f\2\2\u0129\u012a\7\65\2"+
		"\2\u012a\u012b\7\64\2\2\u012b\64\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e"+
		"\7h\2\2\u012e\u012f\7k\2\2\u012f\u0130\7z\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7f\2\2\u0132\u0133\78\2\2\u0133\u0134\7\66\2\2\u0134\66\3\2\2\2"+
		"\u0135\u0136\7U\2\2\u0136\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139"+
		"\7k\2\2\u0139\u013a\7p\2\2\u013a\u013b\7i\2\2\u013b8\3\2\2\2\u013c\u013d"+
		"\7u\2\2\u013d\u013e\7v\2\2\u013e\u013f\7t\2\2\u013f\u0140\7k\2\2\u0140"+
		"\u0141\7p\2\2\u0141\u0142\7i\2\2\u0142:\3\2\2\2\u0143\u0144\7c\2\2\u0144"+
		"\u0145\7d\2\2\u0145\u0146\7u\2\2\u0146\u0147\7v\2\2\u0147\u0148\7t\2\2"+
		"\u0148\u0149\7c\2\2\u0149\u014a\7e\2\2\u014a\u014b\7v\2\2\u014b<\3\2\2"+
		"\2\u014c\u014d\7c\2\2\u014d\u014e\7u\2\2\u014e\u014f\7u\2\2\u014f\u0150"+
		"\7g\2\2\u0150\u0151\7t\2\2\u0151\u0152\7v\2\2\u0152>\3\2\2\2\u0153\u0154"+
		"\7d\2\2\u0154\u0155\7q\2\2\u0155\u0156\7q\2\2\u0156\u0157\7n\2\2\u0157"+
		"\u0158\7g\2\2\u0158\u0159\7c\2\2\u0159\u015a\7p\2\2\u015a@\3\2\2\2\u015b"+
		"\u015c\7d\2\2\u015c\u015d\7t\2\2\u015d\u015e\7g\2\2\u015e\u015f\7c\2\2"+
		"\u015f\u0160\7m\2\2\u0160B\3\2\2\2\u0161\u0162\7d\2\2\u0162\u0163\7{\2"+
		"\2\u0163\u0164\7v\2\2\u0164\u0165\7g\2\2\u0165D\3\2\2\2\u0166\u0167\7"+
		"e\2\2\u0167\u0168\7c\2\2\u0168\u0169\7u\2\2\u0169\u016a\7g\2\2\u016aF"+
		"\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7c\2\2\u016d\u016e\7v\2\2\u016e"+
		"\u016f\7e\2\2\u016f\u0170\7j\2\2\u0170H\3\2\2\2\u0171\u0172\7e\2\2\u0172"+
		"\u0173\7j\2\2\u0173\u0174\7c\2\2\u0174\u0175\7t\2\2\u0175J\3\2\2\2\u0176"+
		"\u0177\7e\2\2\u0177\u0178\7n\2\2\u0178\u0179\7c\2\2\u0179\u017a\7u\2\2"+
		"\u017a\u017b\7u\2\2\u017bL\3\2\2\2\u017c\u017d\7e\2\2\u017d\u017e\7q\2"+
		"\2\u017e\u017f\7p\2\2\u017f\u0180\7u\2\2\u0180\u0181\7v\2\2\u0181N\3\2"+
		"\2\2\u0182\u0183\7e\2\2\u0183\u0184\7q\2\2\u0184\u0185\7p\2\2\u0185\u0186"+
		"\7v\2\2\u0186\u0187\7k\2\2\u0187\u0188\7p\2\2\u0188\u0189\7w\2\2\u0189"+
		"\u018a\7g\2\2\u018aP\3\2\2\2\u018b\u018c\7f\2\2\u018c\u018d\7g\2\2\u018d"+
		"\u018e\7h\2\2\u018e\u018f\7c\2\2\u018f\u0190\7w\2\2\u0190\u0191\7n\2\2"+
		"\u0191\u0192\7v\2\2\u0192R\3\2\2\2\u0193\u0194\7f\2\2\u0194\u0195\7q\2"+
		"\2\u0195T\3\2\2\2\u0196\u0197\7f\2\2\u0197\u0198\7q\2\2\u0198\u0199\7"+
		"w\2\2\u0199\u019a\7d\2\2\u019a\u019b\7n\2\2\u019b\u019c\7g\2\2\u019cV"+
		"\3\2\2\2\u019d\u019e\7g\2\2\u019e\u019f\7n\2\2\u019f\u01a0\7u\2\2\u01a0"+
		"\u01a1\7g\2\2\u01a1X\3\2\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7p\2\2\u01a4"+
		"\u01a5\7w\2\2\u01a5\u01a6\7o\2\2\u01a6Z\3\2\2\2\u01a7\u01a8\7g\2\2\u01a8"+
		"\u01a9\7z\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7p\2\2"+
		"\u01ac\u01ad\7f\2\2\u01ad\u01ae\7u\2\2\u01ae\\\3\2\2\2\u01af\u01b0\7h"+
		"\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4"+
		"\7n\2\2\u01b4^\3\2\2\2\u01b5\u01b6\7h\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8"+
		"\7p\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7n\2\2\u01bb"+
		"\u01bc\7{\2\2\u01bc`\3\2\2\2\u01bd\u01be\7h\2\2\u01be\u01bf\7n\2\2\u01bf"+
		"\u01c0\7q\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7v\2\2\u01c2b\3\2\2\2\u01c3"+
		"\u01c4\7h\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7t\2\2\u01c6d\3\2\2\2\u01c7"+
		"\u01c8\7k\2\2\u01c8\u01c9\7h\2\2\u01c9f\3\2\2\2\u01ca\u01cb\7i\2\2\u01cb"+
		"\u01cc\7q\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7q\2\2\u01ceh\3\2\2\2\u01cf"+
		"\u01d0\7k\2\2\u01d0\u01d1\7o\2\2\u01d1\u01d2\7r\2\2\u01d2\u01d3\7n\2\2"+
		"\u01d3\u01d4\7g\2\2\u01d4\u01d5\7o\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7"+
		"\7p\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7u\2\2\u01d9j\3\2\2\2\u01da\u01db"+
		"\7k\2\2\u01db\u01dc\7o\2\2\u01dc\u01dd\7r\2\2\u01dd\u01de\7q\2\2\u01de"+
		"\u01df\7t\2\2\u01df\u01e0\7v\2\2\u01e0l\3\2\2\2\u01e1\u01e2\7k\2\2\u01e2"+
		"\u01e3\7p\2\2\u01e3\u01e4\7u\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6\7c\2\2"+
		"\u01e6\u01e7\7p\2\2\u01e7\u01e8\7e\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea"+
		"\7q\2\2\u01ea\u01eb\7h\2\2\u01ebn\3\2\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee"+
		"\7p\2\2\u01ee\u01ef\7v\2\2\u01efp\3\2\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2"+
		"\7p\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7t\2\2\u01f5"+
		"\u01f6\7h\2\2\u01f6\u01f7\7c\2\2\u01f7\u01f8\7e\2\2\u01f8\u01f9\7g\2\2"+
		"\u01f9r\3\2\2\2\u01fa\u01fb\7n\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7p\2"+
		"\2\u01fd\u01fe\7i\2\2\u01fet\3\2\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7"+
		"c\2\2\u0201\u0202\7v\2\2\u0202\u0203\7k\2\2\u0203\u0204\7x\2\2\u0204\u0205"+
		"\7g\2\2\u0205v\3\2\2\2\u0206\u0207\7p\2\2\u0207\u0208\7g\2\2\u0208\u0209"+
		"\7y\2\2\u0209x\3\2\2\2\u020a\u020b\7r\2\2\u020b\u020c\7c\2\2\u020c\u020d"+
		"\7e\2\2\u020d\u020e\7m\2\2\u020e\u020f\7c\2\2\u020f\u0210\7i\2\2\u0210"+
		"\u0211\7g\2\2\u0211z\3\2\2\2\u0212\u0213\7r\2\2\u0213\u0214\7t\2\2\u0214"+
		"\u0215\7k\2\2\u0215\u0216\7x\2\2\u0216\u0217\7c\2\2\u0217\u0218\7v\2\2"+
		"\u0218\u0219\7g\2\2\u0219|\3\2\2\2\u021a\u021b\7r\2\2\u021b\u021c\7t\2"+
		"\2\u021c\u021d\7q\2\2\u021d\u021e\7v\2\2\u021e\u021f\7g\2\2\u021f\u0220"+
		"\7e\2\2\u0220\u0221\7v\2\2\u0221\u0222\7g\2\2\u0222\u0223\7f\2\2\u0223"+
		"~\3\2\2\2\u0224\u0225\7r\2\2\u0225\u0226\7w\2\2\u0226\u0227\7d\2\2\u0227"+
		"\u0228\7n\2\2\u0228\u0229\7k\2\2\u0229\u022a\7e\2\2\u022a\u0080\3\2\2"+
		"\2\u022b\u022c\7t\2\2\u022c\u022d\7g\2\2\u022d\u022e\7v\2\2\u022e\u022f"+
		"\7w\2\2\u022f\u0230\7t\2\2\u0230\u0231\7p\2\2\u0231\u0082\3\2\2\2\u0232"+
		"\u0233\7u\2\2\u0233\u0234\7j\2\2\u0234\u0235\7q\2\2\u0235\u0236\7t\2\2"+
		"\u0236\u0237\7v\2\2\u0237\u0084\3\2\2\2\u0238\u0239\7u\2\2\u0239\u023a"+
		"\7v\2\2\u023a\u023b\7c\2\2\u023b\u023c\7v\2\2\u023c\u023d\7k\2\2\u023d"+
		"\u023e\7e\2\2\u023e\u0086\3\2\2\2\u023f\u0240\7u\2\2\u0240\u0241\7v\2"+
		"\2\u0241\u0242\7t\2\2\u0242\u0243\7k\2\2\u0243\u0244\7e\2\2\u0244\u0245"+
		"\7v\2\2\u0245\u0246\7h\2\2\u0246\u0247\7r\2\2\u0247\u0088\3\2\2\2\u0248"+
		"\u0249\7u\2\2\u0249\u024a\7w\2\2\u024a\u024b\7r\2\2\u024b\u024c\7g\2\2"+
		"\u024c\u024d\7t\2\2\u024d\u008a\3\2\2\2\u024e\u024f\7u\2\2\u024f\u0250"+
		"\7y\2\2\u0250\u0251\7k\2\2\u0251\u0252\7v\2\2\u0252\u0253\7e\2\2\u0253"+
		"\u0254\7j\2\2\u0254\u008c\3\2\2\2\u0255\u0256\7u\2\2\u0256\u0257\7{\2"+
		"\2\u0257\u0258\7p\2\2\u0258\u0259\7e\2\2\u0259\u025a\7j\2\2\u025a\u025b"+
		"\7t\2\2\u025b\u025c\7q\2\2\u025c\u025d\7p\2\2\u025d\u025e\7k\2\2\u025e"+
		"\u025f\7|\2\2\u025f\u0260\7g\2\2\u0260\u0261\7f\2\2\u0261\u008e\3\2\2"+
		"\2\u0262\u0263\7v\2\2\u0263\u0264\7j\2\2\u0264\u0265\7k\2\2\u0265\u0266"+
		"\7u\2\2\u0266\u0090\3\2\2\2\u0267\u0268\7v\2\2\u0268\u0269\7j\2\2\u0269"+
		"\u026a\7t\2\2\u026a\u026b\7q\2\2\u026b\u026c\7y\2\2\u026c\u0092\3\2\2"+
		"\2\u026d\u026e\7v\2\2\u026e\u026f\7j\2\2\u026f\u0270\7t\2\2\u0270\u0271"+
		"\7q\2\2\u0271\u0272\7y\2\2\u0272\u0273\7u\2\2\u0273\u0094\3\2\2\2\u0274"+
		"\u0275\7v\2\2\u0275\u0276\7t\2\2\u0276\u0277\7c\2\2\u0277\u0278\7p\2\2"+
		"\u0278\u0279\7u\2\2\u0279\u027a\7k\2\2\u027a\u027b\7g\2\2\u027b\u027c"+
		"\7p\2\2\u027c\u027d\7v\2\2\u027d\u0096\3\2\2\2\u027e\u027f\7v\2\2\u027f"+
		"\u0280\7t\2\2\u0280\u0281\7{\2\2\u0281\u0098\3\2\2\2\u0282\u0283\7x\2"+
		"\2\u0283\u0284\7q\2\2\u0284\u0285\7k\2\2\u0285\u0286\7f\2\2\u0286\u009a"+
		"\3\2\2\2\u0287\u0288\7x\2\2\u0288\u0289\7q\2\2\u0289\u028a\7n\2\2\u028a"+
		"\u028b\7c\2\2\u028b\u028c\7v\2\2\u028c\u028d\7k\2\2\u028d\u028e\7n\2\2"+
		"\u028e\u028f\7g\2\2\u028f\u009c\3\2\2\2\u0290\u0291\7y\2\2\u0291\u0292"+
		"\7j\2\2\u0292\u0293\7k\2\2\u0293\u0294\7n\2\2\u0294\u0295\7g\2\2\u0295"+
		"\u009e\3\2\2\2\u0296\u0297\7u\2\2\u0297\u0298\7g\2\2\u0298\u0299\7n\2"+
		"\2\u0299\u029a\7h\2\2\u029a\u00a0\3\2\2\2\u029b\u029c\7o\2\2\u029c\u029d"+
		"\7g\2\2\u029d\u029e\7u\2\2\u029e\u029f\7u\2\2\u029f\u02a0\7c\2\2\u02a0"+
		"\u02a1\7i\2\2\u02a1\u02a2\7g\2\2\u02a2\u02a3\7K\2\2\u02a3\u02a4\7f\2\2"+
		"\u02a4\u00a2\3\2\2\2\u02a5\u02a6\7g\2\2\u02a6\u02a7\7x\2\2\u02a7\u02a8"+
		"\7g\2\2\u02a8\u02a9\7p\2\2\u02a9\u02aa\7v\2\2\u02aa\u02ab\7K\2\2\u02ab"+
		"\u02ac\7f\2\2\u02ac\u00a4\3\2\2\2\u02ad\u02ae\7u\2\2\u02ae\u02af\7g\2"+
		"\2\u02af\u02b0\7t\2\2\u02b0\u02b1\7k\2\2\u02b1\u02b2\7c\2\2\u02b2\u02b3"+
		"\7n\2\2\u02b3\u02b4\7k\2\2\u02b4\u02b5\7|\2\2\u02b5\u02b6\7g\2\2\u02b6"+
		"\u02b7\7f\2\2\u02b7\u02b8\7U\2\2\u02b8\u02b9\7k\2\2\u02b9\u02ba\7|\2\2"+
		"\u02ba\u02bb\7g\2\2\u02bb\u00a6\3\2\2\2\u02bc\u02bd\7W\2\2\u02bd\u02be"+
		"\7P\2\2\u02be\u02bf\7M\2\2\u02bf\u02c0\7P\2\2\u02c0\u02c1\7Q\2\2\u02c1"+
		"\u02c2\7Y\2\2\u02c2\u02c3\7P\2\2\u02c3\u00a8\3\2\2\2\u02c4\u02c6\t\2\2"+
		"\2\u02c5\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u00aa\3\2\2\2\u02c9\u02ca\t\3\2\2\u02ca\u00ac\3\2\2\2\u02cb"+
		"\u02cc\t\4\2\2\u02cc\u00ae\3\2\2\2\u02cd\u02ce\t\2\2\2\u02ce\u00b0\3\2"+
		"\2\2\u02cf\u02d3\5\u00abV\2\u02d0\u02d2\5\u00adW\2\u02d1\u02d0\3\2\2\2"+
		"\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u00b2"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\t\5\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2"+
		"\2\2\u02db\u02dc\bZ\2\2\u02dc\u00b4\3\2\2\2\u02dd\u02de\7\61\2\2\u02de"+
		"\u02df\7,\2\2\u02df\u02e3\3\2\2\2\u02e0\u02e2\13\2\2\2\u02e1\u02e0\3\2"+
		"\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7,\2\2\u02e7\u02e8\7\61"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\b[\2\2\u02ea\u00b6\3\2\2\2\u02eb"+
		"\u02ec\7\61\2\2\u02ec\u02ed\7\61\2\2\u02ed\u02f1\3\2\2\2\u02ee\u02f0\n"+
		"\6\2\2\u02ef\u02ee\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u00b8\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f8\7%"+
		"\2\2\u02f5\u02f7\n\6\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f8\3\2"+
		"\2\2\u02fb\u02fc\b]\2\2\u02fc\u00ba\3\2\2\2\t\2\u02c7\u02d3\u02d9\u02e3"+
		"\u02f1\u02f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}