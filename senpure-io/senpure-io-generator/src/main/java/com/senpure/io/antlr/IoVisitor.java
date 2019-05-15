// Generated from E:/Projects/senpure/senpure-io/senpure-io-generator/src/main/resources\Io.g4 by ANTLR 4.7.2
package com.senpure.io.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IoParser#protocol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol(IoParser.ProtocolContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#headContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadContent(IoParser.HeadContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(IoParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#importIo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportIo(IoParser.ImportIoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#importValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportValue(IoParser.ImportValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#javaPack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaPack(IoParser.JavaPackContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#javaPackageValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaPackageValue(IoParser.JavaPackageValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(IoParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#namespaceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceValue(IoParser.NamespaceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(IoParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#filePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilePath(IoParser.FilePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(IoParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#messageHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageHead(IoParser.MessageHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#messageType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageType(IoParser.MessageTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#messageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageName(IoParser.MessageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#messageId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageId(IoParser.MessageIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(IoParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#eventHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventHead(IoParser.EventHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(IoParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#eventId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventId(IoParser.EventIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#bean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBean(IoParser.BeanContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#beanHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeanHead(IoParser.BeanHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#beanName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeanName(IoParser.BeanNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(IoParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(IoParser.FieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(IoParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IoParser#fieldComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldComment(IoParser.FieldCommentContext ctx);
}