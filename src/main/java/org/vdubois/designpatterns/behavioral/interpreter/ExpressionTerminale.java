package org.vdubois.designpatterns.behavioral.interpreter;

/**
 * Implemente une expression terminale
 * @author Vincent Dubois
 * @version 1.0
 */
public class ExpressionTerminale extends Expression {
	
	/**
	 * texte
	 */
	private String texte;

	/**
	 * Constructeur
	 * @param texte
	 */
	public ExpressionTerminale(String texte) {
		this.texte = texte;
	}

	/**
	 * @see org.vdubois.designpatterns.behavioral.interpreter.Expression#operation(int)
	 */
	public void operation(int indentation) {
		afficherIndentation(indentation);
		System.out.println(texte);
	}
}
