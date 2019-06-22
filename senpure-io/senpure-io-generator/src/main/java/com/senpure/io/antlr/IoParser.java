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
	public static final int
		RULE_protocol = 0, RULE_headContent = 1, RULE_entity = 2, RULE_importIo = 3, 
		RULE_importValue = 4, RULE_javaPack = 5, RULE_javaPackageValue = 6, RULE_namespace = 7, 
		RULE_namespaceValue = 8, RULE_fileName = 9, RULE_filePath = 10, RULE_message = 11, 
		RULE_messageHead = 12, RULE_messageType = 13, RULE_messageName = 14, RULE_messageId = 15, 
		RULE_entityComment = 16, RULE_event = 17, RULE_eventHead = 18, RULE_eventName = 19, 
		RULE_eventId = 20, RULE_bean = 21, RULE_beanHead = 22, RULE_beanName = 23, 
		RULE_field = 24, RULE_fieldList = 25, RULE_fieldIndex = 26, RULE_fieldType = 27, 
		RULE_fieldName = 28, RULE_fieldComment = 29, RULE_enumSymbol = 30, RULE_enumDefaultField = 31, 
		RULE_enumField = 32, RULE_enumHead = 33, RULE_enumName = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"protocol", "headContent", "entity", "importIo", "importValue", "javaPack", 
			"javaPackageValue", "namespace", "namespaceValue", "fileName", "filePath", 
			"message", "messageHead", "messageType", "messageName", "messageId", 
			"entityComment", "event", "eventHead", "eventName", "eventId", "bean", 
			"beanHead", "beanName", "field", "fieldList", "fieldIndex", "fieldType", 
			"fieldName", "fieldComment", "enumSymbol", "enumDefaultField", "enumField", 
			"enumHead", "enumName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.io'", "'javaPack'", "'.'", "'namespace'", "'../'", "'/'", 
			"'\\'", "'{'", "'}'", "'message'", "'cs'", "'CS'", "'sc'", "'SC'", "'event'", 
			"'bean'", "'='", "'['", "']'", "'sint'", "'slong'", "'sfixed32'", "'sfixed64'", 
			"'String'", "'string'", "'1'", "'abstract'", "'assert'", "'boolean'", 
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << IMPORT))) != 0)) {
				{
				{
				setState(70);
				headContent();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << ENUM))) != 0) || _la==LINE_COMMENT) {
				{
				{
				setState(76);
				entity();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				importIo();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				javaPack();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				message();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				event();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				bean();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
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
			setState(95);
			match(IMPORT);
			setState(96);
			importValue();
			setState(97);
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
			setState(99);
			filePath(0);
			setState(100);
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
			setState(102);
			match(T__2);
			setState(103);
			javaPackageValue(0);
			setState(104);
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
			setState(107);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new JavaPackageValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_javaPackageValue);
						setState(109);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(110);
						match(T__3);
						setState(111);
						fileName();
						}
						break;
					case 2:
						{
						_localctx = new JavaPackageValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_javaPackageValue);
						setState(112);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(113);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(118);
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
			setState(119);
			match(T__4);
			setState(120);
			namespaceValue(0);
			setState(121);
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
			setState(124);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new NamespaceValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_namespaceValue);
						setState(126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(127);
						match(T__3);
						setState(128);
						fileName();
						}
						break;
					case 2:
						{
						_localctx = new NamespaceValueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_namespaceValue);
						setState(129);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(130);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(135);
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
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(Number);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					match(Identifier);
					}
					} 
				}
				setState(147);
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
			setState(149);
			fileName();
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
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
					setState(151);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(152);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(153);
					fileName();
					}
					} 
				}
				setState(158);
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
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(159);
				entityComment();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			messageHead();
			setState(166);
			messageType();
			setState(167);
			messageName();
			setState(168);
			messageId();
			setState(169);
			match(T__8);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0)) {
				{
				{
				setState(170);
				field();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
			setState(178);
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
			setState(180);
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
			setState(182);
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
			setState(184);
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
			setState(186);
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(188);
				entityComment();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			eventHead();
			setState(195);
			eventName();
			setState(196);
			eventId();
			setState(197);
			match(T__8);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0)) {
				{
				{
				setState(198);
				field();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(206);
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
			setState(208);
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
			setState(210);
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
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(212);
				entityComment();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			beanHead();
			setState(219);
			beanName();
			setState(220);
			match(T__8);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				field();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (T__24 - 21)) | (1L << (T__25 - 21)) | (1L << (BOOLEAN - 21)) | (1L << (DOUBLE - 21)) | (1L << (FLOAT - 21)) | (1L << (INT - 21)) | (1L << (LONG - 21)) | (1L << (Identifier - 21)))) != 0) );
			setState(226);
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
			setState(228);
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
			setState(230);
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
			setState(232);
			fieldType();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(233);
				fieldList();
				}
			}

			setState(236);
			fieldName();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(237);
				match(T__17);
				setState(238);
				fieldIndex();
				}
			}

			setState(241);
			match(T__0);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(242);
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
			setState(245);
			match(T__18);
			setState(246);
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
			setState(248);
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
			setState(250);
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
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(Identifier);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				messageHead();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				beanHead();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
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
			setState(258);
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
		public EnumDefaultFieldContext enumDefaultField() {
			return getRuleContext(EnumDefaultFieldContext.class,0);
		}
		public List<EntityCommentContext> entityComment() {
			return getRuleContexts(EntityCommentContext.class);
		}
		public EntityCommentContext entityComment(int i) {
			return getRuleContext(EntityCommentContext.class,i);
		}
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
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
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(260);
				entityComment();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			enumHead();
			setState(267);
			enumName();
			setState(268);
			match(T__8);
			setState(269);
			enumDefaultField();
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(270);
				enumField();
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__16))) != 0) || _la==Identifier );
			setState(275);
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

	public static class EnumDefaultFieldContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public FieldCommentContext fieldComment() {
			return getRuleContext(FieldCommentContext.class,0);
		}
		public EnumDefaultFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefaultField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).enterEnumDefaultField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IoListener ) ((IoListener)listener).exitEnumDefaultField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IoVisitor ) return ((IoVisitor<? extends T>)visitor).visitEnumDefaultField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefaultFieldContext enumDefaultField() throws RecognitionException {
		EnumDefaultFieldContext _localctx = new EnumDefaultFieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumDefaultField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			fieldName();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(278);
				match(T__17);
				setState(279);
				match(T__26);
				}
			}

			setState(282);
			match(T__0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(283);
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
		enterRule(_localctx, 64, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			fieldName();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(287);
				match(T__17);
				setState(288);
				fieldIndex();
				}
			}

			setState(291);
			match(T__0);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(292);
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
		enterRule(_localctx, 66, RULE_enumHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 68, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n\2\f\2\16"+
		"\2S\13\2\3\2\3\2\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bu\n\b\f\b\16\bx\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0086\n\n\f\n\16\n\u0089\13\n\3\13\7\13\u008c\n\13\f\13\16\13\u008f"+
		"\13\13\3\13\7\13\u0092\n\13\f\13\16\13\u0095\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u009d\n\f\f\f\16\f\u00a0\13\f\3\r\7\r\u00a3\n\r\f\r\16\r\u00a6"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1\13\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\7\23\u00c0\n"+
		"\23\f\23\16\23\u00c3\13\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ca\n\23\f"+
		"\23\16\23\u00cd\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\7\27"+
		"\u00d8\n\27\f\27\16\27\u00db\13\27\3\27\3\27\3\27\3\27\6\27\u00e1\n\27"+
		"\r\27\16\27\u00e2\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u00ed\n"+
		"\32\3\32\3\32\3\32\5\32\u00f2\n\32\3\32\3\32\5\32\u00f6\n\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0103\n\36\3\37\3\37"+
		"\3 \7 \u0108\n \f \16 \u010b\13 \3 \3 \3 \3 \3 \6 \u0112\n \r \16 \u0113"+
		"\3 \3 \3!\3!\3!\5!\u011b\n!\3!\3!\5!\u011f\n!\3\"\3\"\3\"\5\"\u0124\n"+
		"\"\3\"\3\"\5\"\u0128\n\"\3#\3#\3$\3$\3$\2\5\16\22\26%\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\5\3\2\b\n\3\2\16"+
		"\21\t\2\27\34  ++\61\6188::UU\2\u012a\2K\3\2\2\2\4Y\3\2\2\2\6_\3\2\2\2"+
		"\ba\3\2\2\2\ne\3\2\2\2\fh\3\2\2\2\16l\3\2\2\2\20y\3\2\2\2\22}\3\2\2\2"+
		"\24\u008d\3\2\2\2\26\u0096\3\2\2\2\30\u00a4\3\2\2\2\32\u00b4\3\2\2\2\34"+
		"\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00bc\3\2\2\2$\u00c1"+
		"\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00d4\3\2\2\2,\u00d9\3\2\2\2."+
		"\u00e6\3\2\2\2\60\u00e8\3\2\2\2\62\u00ea\3\2\2\2\64\u00f7\3\2\2\2\66\u00fa"+
		"\3\2\2\28\u00fc\3\2\2\2:\u0102\3\2\2\2<\u0104\3\2\2\2>\u0109\3\2\2\2@"+
		"\u0117\3\2\2\2B\u0120\3\2\2\2D\u0129\3\2\2\2F\u012b\3\2\2\2HJ\5\4\3\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\6\4\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\2\2\3"+
		"U\3\3\2\2\2VZ\5\b\5\2WZ\5\f\7\2XZ\5\20\t\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2"+
		"\2Z\5\3\2\2\2[`\5\30\r\2\\`\5$\23\2]`\5,\27\2^`\5> \2_[\3\2\2\2_\\\3\2"+
		"\2\2_]\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\7\66\2\2bc\5\n\6\2cd\7\3\2\2d\t"+
		"\3\2\2\2ef\5\26\f\2fg\7\4\2\2g\13\3\2\2\2hi\7\5\2\2ij\5\16\b\2jk\7\3\2"+
		"\2k\r\3\2\2\2lm\b\b\1\2mn\5\24\13\2nv\3\2\2\2op\f\4\2\2pq\7\6\2\2qu\5"+
		"\24\13\2rs\f\3\2\2su\7\4\2\2to\3\2\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\7\7\2\2z{\5\22\n\2{|\7\3\2\2|\21\3\2"+
		"\2\2}~\b\n\1\2~\177\5\24\13\2\177\u0087\3\2\2\2\u0080\u0081\f\4\2\2\u0081"+
		"\u0082\7\6\2\2\u0082\u0086\5\24\13\2\u0083\u0084\f\3\2\2\u0084\u0086\7"+
		"\4\2\2\u0085\u0080\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\23\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008c\7T\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0093\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\7U\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\b\f\1\2\u0097\u0098\5\24\13\2\u0098\u009e\3\2\2\2\u0099\u009a\f\3\2\2"+
		"\u009a\u009b\t\2\2\2\u009b\u009d\5\24\13\2\u009c\u0099\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a3\5\"\22\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa"+
		"\5\36\20\2\u00aa\u00ab\5 \21\2\u00ab\u00af\7\13\2\2\u00ac\u00ae\5\62\32"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\f\2\2\u00b3"+
		"\31\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7"+
		"\35\3\2\2\2\u00b8\u00b9\7U\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7T\2\2\u00bb"+
		"!\3\2\2\2\u00bc\u00bd\7X\2\2\u00bd#\3\2\2\2\u00be\u00c0\5\"\22\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5&\24\2\u00c5"+
		"\u00c6\5(\25\2\u00c6\u00c7\5*\26\2\u00c7\u00cb\7\13\2\2\u00c8\u00ca\5"+
		"\62\32\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\f"+
		"\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7\22\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7"+
		"U\2\2\u00d3)\3\2\2\2\u00d4\u00d5\7T\2\2\u00d5+\3\2\2\2\u00d6\u00d8\5\""+
		"\22\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\5."+
		"\30\2\u00dd\u00de\5\60\31\2\u00de\u00e0\7\13\2\2\u00df\u00e1\5\62\32\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\f\2\2\u00e5-\3\2\2\2\u00e6"+
		"\u00e7\7\23\2\2\u00e7/\3\2\2\2\u00e8\u00e9\7U\2\2\u00e9\61\3\2\2\2\u00ea"+
		"\u00ec\58\35\2\u00eb\u00ed\5\64\33\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\5:\36\2\u00ef\u00f0\7\24\2\2\u00f0"+
		"\u00f2\5\66\34\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f5\7\3\2\2\u00f4\u00f6\5<\37\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\63\3\2\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00f9\7\26"+
		"\2\2\u00f9\65\3\2\2\2\u00fa\u00fb\7T\2\2\u00fb\67\3\2\2\2\u00fc\u00fd"+
		"\t\4\2\2\u00fd9\3\2\2\2\u00fe\u0103\7U\2\2\u00ff\u0103\5\32\16\2\u0100"+
		"\u0103\5.\30\2\u0101\u0103\5&\24\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103;\3\2\2\2\u0104\u0105"+
		"\7X\2\2\u0105=\3\2\2\2\u0106\u0108\5\"\22\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\5D#\2\u010d\u010e\5F$\2\u010e\u010f"+
		"\7\13\2\2\u010f\u0111\5@!\2\u0110\u0112\5B\"\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\7\f\2\2\u0116?\3\2\2\2\u0117\u011a\5:\36\2\u0118\u0119"+
		"\7\24\2\2\u0119\u011b\7\35\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c\u011e\7\3\2\2\u011d\u011f\5<\37\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011fA\3\2\2\2\u0120\u0123\5:\36\2\u0121"+
		"\u0122\7\24\2\2\u0122\u0124\5\66\34\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\7\3\2\2\u0126\u0128\5<\37\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128C\3\2\2\2\u0129\u012a\7-\2\2\u012a"+
		"E\3\2\2\2\u012b\u012c\7U\2\2\u012cG\3\2\2\2\35KQY_tv\u0085\u0087\u008d"+
		"\u0093\u009e\u00a4\u00af\u00c1\u00cb\u00d9\u00e2\u00ec\u00f1\u00f5\u0102"+
		"\u0109\u0113\u011a\u011e\u0123\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}