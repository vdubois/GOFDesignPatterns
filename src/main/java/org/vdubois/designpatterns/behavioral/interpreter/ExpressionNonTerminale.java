package org.vdubois.designpatterns.behavioral.interpreter;

import java.util.LinkedList;
import java.util.List;

/**
 * Implemente une expression non terminale
 * @author Vincent Dubois
 * @version 1.0
 */
public class ExpressionNonTerminale extends Expression {

	/**
	 * Libelle
	 */
	private String libelle;
	
	/** 
	 * expressions
	 */
	private List<Expression> expressions = new LinkedList<Expression>();

	/**
	 * Constructeur
	 * @param libelle
	 */
	public ExpressionNonTerminale(String libelle) {
		this.libelle = libelle;
	}
	
	/** 
	 * ajouterExpression
	 * @param expression
	 */
	public void ajouterExpression(Expression expression) {
		expressions.add(expression);
	}

	/**
	 * @see org.vdubois.designpatterns.behavioral.interpreter.Expression#operation(int)
	 */
	public void operation(int indentation) {
		afficherIndentation(indentation);
		System.out.println("<" + libelle + ">");
		for (Expression expression : expressions) {
			expression.operation(indentation + 1);
		}
		afficherIndentation(indentation);
		System.out.println("</" + libelle + ">");
	}
}
