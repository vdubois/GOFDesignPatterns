package org.vdubois.designpatterns.structural.decorator;

/**
 * Objet décorateur abstrait de l'abstraction
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Decorateur implements Abstraction {

	/** 
	 * abstraction
	 */
	protected Abstraction abstraction;

	/** 
	 * Constructeur
	 * @param abstraction
	 */
	public Decorateur(Abstraction abstraction) {
		this.abstraction = abstraction;
	}
}
