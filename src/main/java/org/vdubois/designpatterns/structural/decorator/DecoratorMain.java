package org.vdubois.designpatterns.structural.decorator;


/**
 * DecoratorMain.java
 *
 * @author CDM/EPA
 * @version 1.0
 * @date 24 janv. 2012 
 * @copyright La Poste 2012
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
