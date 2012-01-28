package org.vdubois.designpatterns.structural.decorator;

/**
 * Objet décorateur 
 * @author Vincent Dubois
 * @version 1.0
 */
public class DecorateurA extends Decorateur {

	/**
	 * Constructeur
	 * @param abstraction
	 */
	public DecorateurA(Abstraction abstraction) {
		super(abstraction);
	}

	/** 
	 * @see Abstraction#operation()
	 */
	public void operation() {
		System.out.println("ImplDecorateurA avant");
		abstraction.operation();
		System.out.println("ImplDecorateurA apres");
	}
}
