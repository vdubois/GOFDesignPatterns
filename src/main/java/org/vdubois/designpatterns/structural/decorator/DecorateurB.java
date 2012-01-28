package org.vdubois.designpatterns.structural.decorator;

/**
 * Objet décorateur 
 * @author Vincent Dubois
 * @version 1.0
 */
public class DecorateurB extends Decorateur {

	/**
	 * Constructeur
	 * @param abstraction
	 */
	public DecorateurB(Abstraction abstraction) {
		super(abstraction);
	}

	/** 
	 * @see Abstraction#operation()
	 */
	public void operation() {
		System.out.println("ImplDecorateurB avant");
		abstraction.operation();
		System.out.println("ImplDecorateurB apres");
	}
}
