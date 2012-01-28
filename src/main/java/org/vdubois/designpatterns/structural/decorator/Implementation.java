package org.vdubois.designpatterns.structural.decorator;

/**
 * Implémentation de l'abstraction
 * @author Vincent Dubois
 * @version 1.0
 */
public class Implementation implements Abstraction {

	/** 
	 * @see Abstraction#operation()
	 */
	public void operation() {
		System.out.println("Implementation");
	}
}
