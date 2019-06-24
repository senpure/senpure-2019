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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << ENUM))) != 0) || _la==LINE_COMMENT) {
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
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new JavaPackageValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_javaPackageValue);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						match(T__3);
						setState(109);
						fileName();
						}
						break;
					case 2:
						{
						_localctx = new JavaPackageValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_javaPackageValue);
						setState(110);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(111);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(116);
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
			setState(117);
			match(T__4);
			setState(118);
			namespaceValue(0);
			setState(119);
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
			setState(122);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new NamespaceValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_namespaceValue);
						setState(124);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(125);
						match(T__3);
						setState(126);
						fileName();
						}
						break;
					case 2:
						{
						_localctx = new NamespaceValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_namespaceValue);
						setState(127);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(128);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(Number);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					match(Identifier);
					}
					} 
				}
				setState(145);
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
			setState(147);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilePathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_filePath);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(151);
					fileName();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(157);
				entityComment();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			messageHead();
			setState(164);
			messageType();
			setState(165);
			messageName();
			setState(166);
			messageId();
			setState(167);
			match(T__8);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0)) {
				{
				{
				setState(168);
				field();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__9);
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
			setState(176);
			match(T__10);
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
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
			setState(180);
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
			setState(182);
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
			setState(184);
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
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(186);
				entityComment();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			eventHead();
			setState(193);
			eventName();
			setState(194);
			eventId();
			setState(195);
			match(T__8);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0)) {
				{
				{
				setState(196);
				field();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__9);
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
			setState(204);
			match(T__15);
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
			setState(206);
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
			setState(208);
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
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(210);
				entityComment();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			beanHead();
			setState(217);
			beanName();
			setState(218);
			match(T__8);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				field();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0) );
			setState(224);
			match(T__9);
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
			setState(226);
			match(T__16);
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
			setState(228);
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
			setState(230);
			fieldType();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(231);
				fieldList();
				}
			}

			setState(234);
			fieldName();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(235);
				match(T__17);
				setState(236);
				fieldIndex();
				}
			}

			setState(239);
			match(T__0);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(240);
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
			setState(243);
			match(T__18);
			setState(244);
			match(T__19);
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
			setState(246);
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
			setState(248);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0)) ) {
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(Identifier);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				messageHead();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				beanHead();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
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
			setState(256);
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
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(258);
				entityComment();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			enumHead();
			setState(265);
			enumName();
			setState(266);
			match(T__8);
			setState(267);
			enumField();
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				enumField();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__16))) != 0) || _la==Identifier );
			setState(273);
			match(T__9);
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
			setState(275);
			fieldName();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(276);
				match(T__17);
				setState(277);
				fieldIndex();
				}
			}

			setState(280);
			match(T__0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(281);
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
			setState(284);
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
			setState(286);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean namespaceValue_sempred(NamespaceValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean filePath_sempred(FilePathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3X\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bs\n"+
		"\b\f\b\16\bv\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0084\n\n\f\n\16\n\u0087\13\n\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13"+
		"\13\3\13\7\13\u0090\n\13\f\13\16\13\u0093\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\7\23\u00be\n"+
		"\23\f\23\16\23\u00c1\13\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c8\n\23\f"+
		"\23\16\23\u00cb\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\7\27"+
		"\u00d6\n\27\f\27\16\27\u00d9\13\27\3\27\3\27\3\27\3\27\6\27\u00df\n\27"+
		"\r\27\16\27\u00e0\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u00eb\n"+
		"\32\3\32\3\32\3\32\5\32\u00f0\n\32\3\32\3\32\5\32\u00f4\n\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0101\n\36\3\37\3\37"+
		"\3 \7 \u0106\n \f \16 \u0109\13 \3 \3 \3 \3 \3 \6 \u0110\n \r \16 \u0111"+
		"\3 \3 \3!\3!\3!\5!\u0119\n!\3!\3!\5!\u011d\n!\3\"\3\"\3#\3#\3#\2\5\16"+
		"\22\26$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BD\2\5\3\2\b\n\3\2\16\21\t\2\27\34\37\37**\60\60\67\6799TT\2\u011e"+
		"\2I\3\2\2\2\4W\3\2\2\2\6]\3\2\2\2\b_\3\2\2\2\nc\3\2\2\2\ff\3\2\2\2\16"+
		"j\3\2\2\2\20w\3\2\2\2\22{\3\2\2\2\24\u008b\3\2\2\2\26\u0094\3\2\2\2\30"+
		"\u00a2\3\2\2\2\32\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2 \u00b8"+
		"\3\2\2\2\"\u00ba\3\2\2\2$\u00bf\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2"+
		"*\u00d2\3\2\2\2,\u00d7\3\2\2\2.\u00e4\3\2\2\2\60\u00e6\3\2\2\2\62\u00e8"+
		"\3\2\2\2\64\u00f5\3\2\2\2\66\u00f8\3\2\2\28\u00fa\3\2\2\2:\u0100\3\2\2"+
		"\2<\u0102\3\2\2\2>\u0107\3\2\2\2@\u0115\3\2\2\2B\u011e\3\2\2\2D\u0120"+
		"\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2K"+
		"I\3\2\2\2LN\5\6\4\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2"+
		"QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TX\5\b\5\2UX\5\f\7\2VX\5\20\t\2WT\3\2\2"+
		"\2WU\3\2\2\2WV\3\2\2\2X\5\3\2\2\2Y^\5\30\r\2Z^\5$\23\2[^\5,\27\2\\^\5"+
		"> \2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\7\3\2\2\2_`\7\65\2\2`a"+
		"\5\n\6\2ab\7\3\2\2b\t\3\2\2\2cd\5\26\f\2de\7\4\2\2e\13\3\2\2\2fg\7\5\2"+
		"\2gh\5\16\b\2hi\7\3\2\2i\r\3\2\2\2jk\b\b\1\2kl\5\24\13\2lt\3\2\2\2mn\f"+
		"\4\2\2no\7\6\2\2os\5\24\13\2pq\f\3\2\2qs\7\4\2\2rm\3\2\2\2rp\3\2\2\2s"+
		"v\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vt\3\2\2\2wx\7\7\2\2xy\5\22\n"+
		"\2yz\7\3\2\2z\21\3\2\2\2{|\b\n\1\2|}\5\24\13\2}\u0085\3\2\2\2~\177\f\4"+
		"\2\2\177\u0080\7\6\2\2\u0080\u0084\5\24\13\2\u0081\u0082\f\3\2\2\u0082"+
		"\u0084\7\4\2\2\u0083~\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008a\7S\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0090\7T\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0094\u0095\b\f\1\2\u0095\u0096\5\24\13\2\u0096\u009c\3\2\2\2\u0097"+
		"\u0098\f\3\2\2\u0098\u0099\t\2\2\2\u0099\u009b\5\24\13\2\u009a\u0097\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\27\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\"\22\2\u00a0\u009f\3\2\2"+
		"\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\5\34\17"+
		"\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\5 \21\2\u00a9\u00ad\7\13\2\2\u00aa"+
		"\u00ac\5\62\32\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7\f\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3\33\3\2\2\2\u00b4"+
		"\u00b5\t\3\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\7T\2\2\u00b7\37\3\2\2\2\u00b8"+
		"\u00b9\7S\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7W\2\2\u00bb#\3\2\2\2\u00bc\u00be"+
		"\5\"\22\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\5&\24\2\u00c3\u00c4\5(\25\2\u00c4\u00c5\5*\26\2\u00c5\u00c9\7\13\2\2"+
		"\u00c6\u00c8\5\62\32\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\f\2\2\u00cd%\3\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\'\3\2\2\2\u00d0"+
		"\u00d1\7T\2\2\u00d1)\3\2\2\2\u00d2\u00d3\7S\2\2\u00d3+\3\2\2\2\u00d4\u00d6"+
		"\5\"\22\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db"+
		"\5.\30\2\u00db\u00dc\5\60\31\2\u00dc\u00de\7\13\2\2\u00dd\u00df\5\62\32"+
		"\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\f\2\2\u00e3-\3\2\2\2\u00e4"+
		"\u00e5\7\23\2\2\u00e5/\3\2\2\2\u00e6\u00e7\7T\2\2\u00e7\61\3\2\2\2\u00e8"+
		"\u00ea\58\35\2\u00e9\u00eb\5\64\33\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\5:\36\2\u00ed\u00ee\7\24\2\2\u00ee"+
		"\u00f0\5\66\34\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f3\7\3\2\2\u00f2\u00f4\5<\37\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\63\3\2\2\2\u00f5\u00f6\7\25\2\2\u00f6\u00f7\7\26"+
		"\2\2\u00f7\65\3\2\2\2\u00f8\u00f9\7S\2\2\u00f9\67\3\2\2\2\u00fa\u00fb"+
		"\t\4\2\2\u00fb9\3\2\2\2\u00fc\u0101\7T\2\2\u00fd\u0101\5\32\16\2\u00fe"+
		"\u0101\5.\30\2\u00ff\u0101\5&\24\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101;\3\2\2\2\u0102\u0103"+
		"\7W\2\2\u0103=\3\2\2\2\u0104\u0106\5\"\22\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5B\"\2\u010b\u010c\5D#\2\u010c\u010d"+
		"\7\13\2\2\u010d\u010f\5@!\2\u010e\u0110\5@!\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\7\f\2\2\u0114?\3\2\2\2\u0115\u0118\5:\36\2\u0116\u0117"+
		"\7\24\2\2\u0117\u0119\5\66\34\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\u011a\3\2\2\2\u011a\u011c\7\3\2\2\u011b\u011d\5<\37\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011dA\3\2\2\2\u011e\u011f\7,\2\2\u011fC"+
		"\3\2\2\2\u0120\u0121\7T\2\2\u0121E\3\2\2\2\33IOW]rt\u0083\u0085\u008b"+
		"\u0091\u009c\u00a2\u00ad\u00bf\u00c9\u00d7\u00e0\u00ea\u00ef\u00f3\u0100"+
		"\u0107\u0111\u0118\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}