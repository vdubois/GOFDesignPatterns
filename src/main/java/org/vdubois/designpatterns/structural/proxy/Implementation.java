package org.vdubois.designpatterns.structural.proxy;

/**
 * Implementation de l'abstraction
 * @author Vincent Dubois
 * @version 1.0
 */
public class Implementation implements Abstraction {

	/** 
	 * @see Abstraction#afficher()
	 */
	public void afficher() {
		System.out.println("Methode afficher() de la classe d'implementation");
	}
}
