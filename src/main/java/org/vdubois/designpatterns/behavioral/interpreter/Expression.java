package org.vdubois.designpatterns.behavioral.interpreter;

/**
 * "Interface" d'une expression
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Expression {

	/**
	 * afficherIndentation
	 * @param indentation
	 */
	protected static void afficherIndentation(int indentation) {
		for (int i=0; i < indentation; i++) {
			System.out.print("\t");
		}
	}
	
	/** 
	 * operation
	 */
	public void operation() {
		operation(0);
	}
	
	/**
	 * operation
	 * @param indentation
	 */
	public abstract void operation(int indentation);
}