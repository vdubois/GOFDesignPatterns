package org.vdubois.designpatterns.structural.decorator;


/**
 * Classe de test du design pattern Décorateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class DecoratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Abstraction impl = new Implementation();
		final Abstraction decorator1 = new DecorateurA(impl);
		final Abstraction decorator2 = new DecorateurB(decorator1);
		
		decorator2.operation();
	}
}
