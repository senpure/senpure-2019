// Generated from E:/Projects/senpure/senpure-io/senpure-io-generator/src/main/resources\Io.g4 by ANTLR 4.7.2
package com.senpure.io.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IoParser extends Parser {
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
		SERIALIZEDSIZE=82, Number=83, Identifier=84, WS=85, COMMENT=86, LINE_COMMENT=87, 
		CODE_COMMENT=88;
	public static final int
		RULE_protocol = 0, RULE_headContent = 1, RULE_entity = 2, RULE_importIo = 3, 
		RULE_importValue = 4, RULE_javaPack = 5, RULE_javaPackageValue = 6, RULE_namespace = 7, 
		RULE_namespaceValue = 8, RULE_fileName = 9, RULE_filePath = 10, RULE_message = 11, 
		RULE_messageHead = 12, RULE_messageType = 13, RULE_messageName = 14, RULE_messageId = 15, 
		RULE_entityComment = 16, RULE_event = 17, RULE_eventHead = 18, RULE_eventName = 19, 
		RULE_eventId = 20, RULE_bean = 21, RULE_beanHead = 22, RULE_beanName = 23, 
		RULE_field = 24, RULE_fieldList = 25, RULE_fieldIndex = 26, RULE_fieldType = 27, 
		RULE_fieldName = 28, RULE_fieldComment = 29, RULE_enumSymbol = 30, RULE_enumField = 31, 
		RULE_enumHead = 32, RULE_enumName = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"protocol", "headContent", "entity", "importIo", "importValue", "javaPack", 
			"javaPackageValue", "namespace", "namespaceValue", "fileName", "filePath", 
			"message", "messageHead", "messageType", "messageName", "messageId", 
			"entityComment", "event", "eventHead", "eventName", "eventId", "bean", 
			"beanHead", "beanName", "field", "fieldList", "fieldIndex", "fieldType", 
			"fieldName", "fieldComment", "enumSymbol", "enumField", "enumHead", "enumName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.io'", "'javaPack'", "'.'", "'namespace'", "'cs'", "'io'", 
			"'-'", "'../'", "'/'", "'\\'", "'{'", "'}'", "'message'", "'CS'", "'sc'", 
			"'SC'", "'event'", "'bean'", "'='", "'['", "']'", "'sint'", "'slong'", 
			"'sfixed32'", "'sfixed64'", "'String'", "'string'", "'abstract'", "'assert'", 
			"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
			"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
			"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
			"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
			"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
			"'void'", "'volatile'", "'while'", "'self'", "'messageId'", "'eventId'", 
			"'serializedSize'"
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

	@Override
	public String getGrammarFileName() { return "Io.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProtocolContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IoParser.EOF, 0); }
		public List<HeadContentContext> headContent() {
			return getRuleContexts(HeadContentContext.class);
		}
		public HeadContentContext headContent(int i) {
			return getRuleContext(HeadContentContext.class,i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterProtocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitProtocol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitProtocol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_protocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << IMPORT))) != 0)) {
				{
				{
				setState(68);
				headContent();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << ENUM))) != 0) || _la==LINE_COMMENT) {
				{
				{
				setState(74);
				entity();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
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

	public static class HeadContentContext extends ParserRuleContext {
		public ImportIoContext importIo() {
			return getRuleContext(ImportIoContext.class,0);
		}
		public JavaPackContext javaPack() {
			return getRuleContext(JavaPackContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public HeadContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterHeadContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitHeadContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitHeadContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContentContext headContent() throws RecognitionException {
		HeadContentContext _localctx = new HeadContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headContent);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				importIo();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				javaPack();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				namespace();
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

	public static class EntityContext extends ParserRuleContext {
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public BeanContext bean() {
			return getRuleContext(BeanContext.class,0);
		}
		public EnumSymbolContext enumSymbol() {
			return getRuleContext(EnumSymbolContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entity);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				message();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				event();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				bean();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				enumSymbol();
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

	public static class ImportIoContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(IoParser.IMPORT, 0); }
		public ImportValueContext importValue() {
			return getRuleContext(ImportValueContext.class,0);
		}
		public ImportIoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importIo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterImportIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitImportIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitImportIo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportIoContext importIo() throws RecognitionException {
		ImportIoContext _localctx = new ImportIoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importIo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IMPORT);
			setState(94);
			importValue();
			setState(95);
			match(T__0);
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

	public static class ImportValueContext extends ParserRuleContext {
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ImportValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterImportValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitImportValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitImportValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportValueContext importValue() throws RecognitionException {
		ImportValueContext _localctx = new ImportValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			filePath(0);
			setState(98);
			match(T__1);
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

	public static class JavaPackContext extends ParserRuleContext {
		public JavaPackageValueContext javaPackageValue() {
			return getRuleContext(JavaPackageValueContext.class,0);
		}
		public JavaPackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaPack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterJavaPack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitJavaPack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitJavaPack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaPackContext javaPack() throws RecognitionException {
		JavaPackContext _localctx = new JavaPackContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_javaPack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__2);
			setState(101);
			javaPackageValue(0);
			setState(102);
			match(T__0);
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

	public static class JavaPackageValueContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public JavaPackageValueContext javaPackageValue() {
			return getRuleContext(JavaPackageValueContext.class,0);
		}
		public JavaPackageValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaPackageValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterJavaPackageValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitJavaPackageValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitJavaPackageValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaPackageValueContext javaPackageValue() throws RecognitionException {
		return javaPackageValue(0);
	}

	private JavaPackageValueContext javaPackageValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JavaPackageValueContext _localctx = new JavaPackageValueContext(_ctx, _parentState);
		JavaPackageValueContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_javaPackageValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaPackageValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_javaPackageValue);
					setState(107);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(108);
					match(T__3);
					setState(109);
					fileName();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__4);
			setState(116);
			namespaceValue(0);
			setState(117);
			match(T__0);
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

	public static class NamespaceValueContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public NamespaceValueContext namespaceValue() {
			return getRuleContext(NamespaceValueContext.class,0);
		}
		public NamespaceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterNamespaceValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitNamespaceValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitNamespaceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceValueContext namespaceValue() throws RecognitionException {
		return namespaceValue(0);
	}

	private NamespaceValueContext namespaceValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NamespaceValueContext _localctx = new NamespaceValueContext(_ctx, _parentState);
		NamespaceValueContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_namespaceValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NamespaceValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_namespaceValue);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					match(T__3);
					setState(124);
					fileName();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(IoParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(IoParser.Number, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(IoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(IoParser.Identifier, i);
		}
		public BeanHeadContext beanHead() {
			return getRuleContext(BeanHeadContext.class,0);
		}
		public MessageHeadContext messageHead() {
			return getRuleContext(MessageHeadContext.class,0);
		}
		public EventHeadContext eventHead() {
			return getRuleContext(EventHeadContext.class,0);
		}
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fileName);
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(130);
						match(Number);
						}
						} 
					}
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(136);
						match(Identifier);
						}
						} 
					}
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				beanHead();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				messageHead();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				eventHead();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(T__4);
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

	public static class FilePathContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFilePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFilePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		return filePath(0);
	}

	private FilePathContext filePath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilePathContext _localctx = new FilePathContext(_ctx, _parentState);
		FilePathContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_filePath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilePathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_filePath);
					setState(153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(154);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(155);
					fileName();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public MessageHeadContext messageHead() {
			return getRuleContext(MessageHeadContext.class,0);
		}
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public MessageNameContext messageName() {
			return getRuleContext(MessageNameContext.class,0);
		}
		public MessageIdContext messageId() {
			return getRuleContext(MessageIdContext.class,0);
		}
		public List<EntityCommentContext> entityComment() {
			return getRuleContexts(EntityCommentContext.class);
		}
		public EntityCommentContext entityComment(int i) {
			return getRuleContext(EntityCommentContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_message);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(161);
				entityComment();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			messageHead();
			setState(168);
			messageType();
			setState(169);
			messageName();
			setState(170);
			messageId();
			setState(171);
			match(T__11);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__23 - 23)) | (1L << (T__24 - 23)) | (1L << (T__25 - 23)) | (1L << (T__26 - 23)) | (1L << (T__27 - 23)) | (1L << (BOOLEAN - 23)) | (1L << (DOUBLE - 23)) | (1L << (FLOAT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (Identifier - 23)))) != 0)) {
				{
				{
				setState(172);
				field();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__12);
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

	public static class MessageHeadContext extends ParserRuleContext {
		public MessageHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterMessageHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitMessageHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitMessageHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageHeadContext messageHead() throws RecognitionException {
		MessageHeadContext _localctx = new MessageHeadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_messageHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__13);
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

	public static class MessageTypeContext extends ParserRuleContext {
		public MessageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterMessageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitMessageType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitMessageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageTypeContext messageType() throws RecognitionException {
		MessageTypeContext _localctx = new MessageTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_messageType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class MessageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IoParser.Identifier, 0); }
		public MessageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterMessageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitMessageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitMessageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageNameContext messageName() throws RecognitionException {
		MessageNameContext _localctx = new MessageNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_messageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(Identifier);
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

	public static class MessageIdContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(IoParser.Number, 0); }
		public MessageIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterMessageId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitMessageId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitMessageId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageIdContext messageId() throws RecognitionException {
		MessageIdContext _localctx = new MessageIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_messageId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Number);
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

	public static class EntityCommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(IoParser.LINE_COMMENT, 0); }
		public EntityCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEntityComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEntityComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEntityComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityCommentContext entityComment() throws RecognitionException {
		EntityCommentContext _localctx = new EntityCommentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_entityComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LINE_COMMENT);
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

	public static class EventContext extends ParserRuleContext {
		public EventHeadContext eventHead() {
			return getRuleContext(EventHeadContext.class,0);
		}
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public EventIdContext eventId() {
			return getRuleContext(EventIdContext.class,0);
		}
		public List<EntityCommentContext> entityComment() {
			return getRuleContexts(EntityCommentContext.class);
		}
		public EntityCommentContext entityComment(int i) {
			return getRuleContext(EntityCommentContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(190);
				entityComment();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			eventHead();
			setState(197);
			eventName();
			setState(198);
			eventId();
			setState(199);
			match(T__11);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__23 - 23)) | (1L << (T__24 - 23)) | (1L << (T__25 - 23)) | (1L << (T__26 - 23)) | (1L << (T__27 - 23)) | (1L << (BOOLEAN - 23)) | (1L << (DOUBLE - 23)) | (1L << (FLOAT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (Identifier - 23)))) != 0)) {
				{
				{
				setState(200);
				field();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__12);
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

	public static class EventHeadContext extends ParserRuleContext {
		public EventHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEventHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEventHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEventHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventHeadContext eventHead() throws RecognitionException {
		EventHeadContext _localctx = new EventHeadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eventHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__17);
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

	public static class EventNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IoParser.Identifier, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEventName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEventName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Identifier);
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

	public static class EventIdContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(IoParser.Number, 0); }
		public EventIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEventId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEventId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEventId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventIdContext eventId() throws RecognitionException {
		EventIdContext _localctx = new EventIdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eventId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Number);
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

	public static class BeanContext extends ParserRuleContext {
		public BeanHeadContext beanHead() {
			return getRuleContext(BeanHeadContext.class,0);
		}
		public BeanNameContext beanName() {
			return getRuleContext(BeanNameContext.class,0);
		}
		public List<EntityCommentContext> entityComment() {
			return getRuleContexts(EntityCommentContext.class);
		}
		public EntityCommentContext entityComment(int i) {
			return getRuleContext(EntityCommentContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public BeanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterBean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitBean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitBean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeanContext bean() throws RecognitionException {
		BeanContext _localctx = new BeanContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(214);
				entityComment();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			beanHead();
			setState(221);
			beanName();
			setState(222);
			match(T__11);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				field();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__23 - 23)) | (1L << (T__24 - 23)) | (1L << (T__25 - 23)) | (1L << (T__26 - 23)) | (1L << (T__27 - 23)) | (1L << (BOOLEAN - 23)) | (1L << (DOUBLE - 23)) | (1L << (FLOAT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (Identifier - 23)))) != 0) );
			setState(228);
			match(T__12);
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

	public static class BeanHeadContext extends ParserRuleContext {
		public BeanHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beanHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterBeanHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitBeanHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitBeanHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeanHeadContext beanHead() throws RecognitionException {
		BeanHeadContext _localctx = new BeanHeadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_beanHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__18);
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

	public static class BeanNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IoParser.Identifier, 0); }
		public BeanNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beanName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterBeanName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitBeanName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitBeanName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeanNameContext beanName() throws RecognitionException {
		BeanNameContext _localctx = new BeanNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_beanName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(Identifier);
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

	public static class FieldContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public FieldIndexContext fieldIndex() {
			return getRuleContext(FieldIndexContext.class,0);
		}
		public FieldCommentContext fieldComment() {
			return getRuleContext(FieldCommentContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			fieldType();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(235);
				fieldList();
				}
			}

			setState(238);
			fieldName();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(239);
				match(T__19);
				setState(240);
				fieldIndex();
				}
			}

			setState(243);
			match(T__0);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(244);
				fieldComment();
				}
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

	public static class FieldListContext extends ParserRuleContext {
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__20);
			setState(248);
			match(T__21);
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

	public static class FieldIndexContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(IoParser.Number, 0); }
		public FieldIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFieldIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFieldIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFieldIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldIndexContext fieldIndex() throws RecognitionException {
		FieldIndexContext _localctx = new FieldIndexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(Number);
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

	public static class FieldTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IoParser.INT, 0); }
		public TerminalNode LONG() { return getToken(IoParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(IoParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(IoParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(IoParser.BOOLEAN, 0); }
		public TerminalNode Identifier() { return getToken(IoParser.Identifier, 0); }
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFieldType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__23 - 23)) | (1L << (T__24 - 23)) | (1L << (T__25 - 23)) | (1L << (T__26 - 23)) | (1L << (T__27 - 23)) | (1L << (BOOLEAN - 23)) | (1L << (DOUBLE - 23)) | (1L << (FLOAT - 23)) | (1L << (INT - 23)) | (1L << (LONG - 23)) | (1L << (Identifier - 23)))) != 0)) ) {
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IoParser.Identifier, 0); }
		public MessageHeadContext messageHead() {
			return getRuleContext(MessageHeadContext.class,0);
		}
		public BeanHeadContext beanHead() {
			return getRuleContext(BeanHeadContext.class,0);
		}
		public EventHeadContext eventHead() {
			return getRuleContext(EventHeadContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldName);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(Identifier);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				messageHead();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				beanHead();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				eventHead();
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

	public static class FieldCommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(IoParser.LINE_COMMENT, 0); }
		public FieldCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterFieldComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitFieldComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitFieldComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldCommentContext fieldComment() throws RecognitionException {
		FieldCommentContext _localctx = new FieldCommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(LINE_COMMENT);
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

	public static class EnumSymbolContext extends ParserRuleContext {
		public EnumHeadContext enumHead() {
			return getRuleContext(EnumHeadContext.class,0);
		}
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public List<EntityCommentContext> entityComment() {
			return getRuleContexts(EntityCommentContext.class);
		}
		public EntityCommentContext entityComment(int i) {
			return getRuleContext(EntityCommentContext.class,i);
		}
		public EnumSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEnumSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEnumSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEnumSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSymbolContext enumSymbol() throws RecognitionException {
		EnumSymbolContext _localctx = new EnumSymbolContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(262);
				entityComment();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			enumHead();
			setState(269);
			enumName();
			setState(270);
			match(T__11);
			setState(271);
			enumField();
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				enumField();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__18))) != 0) || _la==Identifier );
			setState(277);
			match(T__12);
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

	public static class EnumFieldContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public FieldIndexContext fieldIndex() {
			return getRuleContext(FieldIndexContext.class,0);
		}
		public FieldCommentContext fieldComment() {
			return getRuleContext(FieldCommentContext.class,0);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEnumField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEnumField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			fieldName();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(280);
				match(T__19);
				setState(281);
				fieldIndex();
				}
			}

			setState(284);
			match(T__0);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(285);
				fieldComment();
				}
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

	public static class EnumHeadContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(IoParser.ENUM, 0); }
		public EnumHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEnumHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ENUM);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IoParser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(Identifier);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return javaPackageValue_sempred((JavaPackageValueContext)_localctx, predIndex);
		case 8:
			return namespaceValue_sempred((NamespaceValueContext)_localctx, predIndex);
		case 10:
			return filePath_sempred((FilePathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean javaPackageValue_sempred(JavaPackageValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean namespaceValue_sempred(NamespaceValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean filePath_sempred(FilePathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16"+
		"\bt\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16"+
		"\n\u0083\13\n\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\7\13\u008c"+
		"\n\13\f\13\16\13\u008f\13\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0097"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\r\7"+
		"\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b0\n\r"+
		"\f\r\16\r\u00b3\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5\13\23\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u00cc\n\23\f\23\16\23\u00cf\13\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13\27\3\27\3"+
		"\27\3\27\3\27\6\27\u00e3\n\27\r\27\16\27\u00e4\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\5\32\u00ef\n\32\3\32\3\32\3\32\5\32\u00f4\n\32\3\32\3"+
		"\32\5\32\u00f8\n\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\5\36\u0105\n\36\3\37\3\37\3 \7 \u010a\n \f \16 \u010d\13 \3 \3 "+
		"\3 \3 \3 \6 \u0114\n \r \16 \u0115\3 \3 \3!\3!\3!\5!\u011d\n!\3!\3!\5"+
		"!\u0121\n!\3\"\3\"\3#\3#\3#\2\5\16\22\26$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\5\4\2\6\6\n\r\4\2\b\b\21\23\t"+
		"\2\31\36!!,,\62\6299;;VV\2\u0126\2I\3\2\2\2\4W\3\2\2\2\6]\3\2\2\2\b_\3"+
		"\2\2\2\nc\3\2\2\2\ff\3\2\2\2\16j\3\2\2\2\20u\3\2\2\2\22y\3\2\2\2\24\u0096"+
		"\3\2\2\2\26\u0098\3\2\2\2\30\u00a6\3\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3"+
		"\2\2\2\36\u00ba\3\2\2\2 \u00bc\3\2\2\2\"\u00be\3\2\2\2$\u00c3\3\2\2\2"+
		"&\u00d2\3\2\2\2(\u00d4\3\2\2\2*\u00d6\3\2\2\2,\u00db\3\2\2\2.\u00e8\3"+
		"\2\2\2\60\u00ea\3\2\2\2\62\u00ec\3\2\2\2\64\u00f9\3\2\2\2\66\u00fc\3\2"+
		"\2\28\u00fe\3\2\2\2:\u0104\3\2\2\2<\u0106\3\2\2\2>\u010b\3\2\2\2@\u0119"+
		"\3\2\2\2B\u0122\3\2\2\2D\u0124\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2I"+
		"G\3\2\2\2IJ\3\2\2\2JO\3\2\2\2KI\3\2\2\2LN\5\6\4\2ML\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TX\5\b\5"+
		"\2UX\5\f\7\2VX\5\20\t\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\5\3\2\2\2Y^\5\30"+
		"\r\2Z^\5$\23\2[^\5,\27\2\\^\5> \2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2"+
		"\2\2^\7\3\2\2\2_`\7\67\2\2`a\5\n\6\2ab\7\3\2\2b\t\3\2\2\2cd\5\26\f\2d"+
		"e\7\4\2\2e\13\3\2\2\2fg\7\5\2\2gh\5\16\b\2hi\7\3\2\2i\r\3\2\2\2jk\b\b"+
		"\1\2kl\5\24\13\2lr\3\2\2\2mn\f\3\2\2no\7\6\2\2oq\5\24\13\2pm\3\2\2\2q"+
		"t\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tr\3\2\2\2uv\7\7\2\2vw\5\22\n"+
		"\2wx\7\3\2\2x\21\3\2\2\2yz\b\n\1\2z{\5\24\13\2{\u0081\3\2\2\2|}\f\3\2"+
		"\2}~\7\6\2\2~\u0080\5\24\13\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0086\7U\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008c\7V\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0097\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0097\7\b\2\2\u0091\u0097\5.\30\2\u0092\u0097\5\32\16\2\u0093\u0097\5"+
		"&\24\2\u0094\u0097\7\t\2\2\u0095\u0097\7\7\2\2\u0096\u0087\3\2\2\2\u0096"+
		"\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099"+
		"\b\f\1\2\u0099\u009a\5\24\13\2\u009a\u00a0\3\2\2\2\u009b\u009c\f\3\2\2"+
		"\u009c\u009d\t\2\2\2\u009d\u009f\5\24\13\2\u009e\u009b\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a5\5\"\22\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac"+
		"\5\36\20\2\u00ac\u00ad\5 \21\2\u00ad\u00b1\7\16\2\2\u00ae\u00b0\5\62\32"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\17\2\2"+
		"\u00b5\31\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\t"+
		"\3\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\7V\2\2\u00bb\37\3\2\2\2\u00bc\u00bd"+
		"\7U\2\2\u00bd!\3\2\2\2\u00be\u00bf\7Y\2\2\u00bf#\3\2\2\2\u00c0\u00c2\5"+
		"\"\22\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5&"+
		"\24\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\5*\26\2\u00c9\u00cd\7\16\2\2\u00ca"+
		"\u00cc\5\62\32\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\7\17\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7\24\2\2\u00d3\'\3\2\2\2\u00d4"+
		"\u00d5\7V\2\2\u00d5)\3\2\2\2\u00d6\u00d7\7U\2\2\u00d7+\3\2\2\2\u00d8\u00da"+
		"\5\"\22\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\5.\30\2\u00df\u00e0\5\60\31\2\u00e0\u00e2\7\16\2\2\u00e1\u00e3\5\62\32"+
		"\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7-\3\2\2\2\u00e8"+
		"\u00e9\7\25\2\2\u00e9/\3\2\2\2\u00ea\u00eb\7V\2\2\u00eb\61\3\2\2\2\u00ec"+
		"\u00ee\58\35\2\u00ed\u00ef\5\64\33\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\5:\36\2\u00f1\u00f2\7\26\2\2\u00f2"+
		"\u00f4\5\66\34\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f7\7\3\2\2\u00f6\u00f8\5<\37\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\63\3\2\2\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb\7\30"+
		"\2\2\u00fb\65\3\2\2\2\u00fc\u00fd\7U\2\2\u00fd\67\3\2\2\2\u00fe\u00ff"+
		"\t\4\2\2\u00ff9\3\2\2\2\u0100\u0105\7V\2\2\u0101\u0105\5\32\16\2\u0102"+
		"\u0105\5.\30\2\u0103\u0105\5&\24\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105;\3\2\2\2\u0106\u0107"+
		"\7Y\2\2\u0107=\3\2\2\2\u0108\u010a\5\"\22\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5B\"\2\u010f\u0110\5D#\2\u0110\u0111"+
		"\7\16\2\2\u0111\u0113\5@!\2\u0112\u0114\5@!\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\7\17\2\2\u0118?\3\2\2\2\u0119\u011c\5:\36\2\u011a\u011b"+
		"\7\26\2\2\u011b\u011d\5\66\34\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u0120\7\3\2\2\u011f\u0121\5<\37\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121A\3\2\2\2\u0122\u0123\7.\2\2\u0123C"+
		"\3\2\2\2\u0124\u0125\7V\2\2\u0125E\3\2\2\2\32IOW]r\u0081\u0087\u008d\u0096"+
		"\u00a0\u00a6\u00b1\u00c3\u00cd\u00db\u00e4\u00ee\u00f3\u00f7\u0104\u010b"+
		"\u0115\u011c\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}