package org.vdubois.designpatterns.structural.proxy;

/**
 * Classe proxy d'acces a l'implementation
 * @author Vincent Dubois
 * @version 1.0
 */
public class Proxy implements Abstraction {

	/** 
	 * @see Abstraction#afficher()
	 */
	public void afficher() {
		System.out.println("--> Methode afficher() du Proxy : ");
		System.out.println("--> Creation de l'objet Implementation au besoin");
		Implementation implementation = new Implementation();
		System.out.println("--> Appel de la methode afficher() de l'objet Implementation");
		implementation.afficher();
	}
}
