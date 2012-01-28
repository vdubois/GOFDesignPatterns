package org.vdubois.designpatterns.creational.factory;

/**
 * Classe de test du design pattern Fabrique
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fabrique factory1 = new FabriqueA();
		Fabrique factory2 = new FabriqueB();

		ClasseAbstraite classe1 = factory1.creerClasse();
		ClasseAbstraite classe1bis = factory1.creerClasse();
		ClasseAbstraite classe2 = factory2.creerClasse();
		ClasseAbstraite classe2bis = factory2.creerClasse();

		classe1.afficherClasse();
		classe1bis.afficherClasse();
		classe2.afficherClasse();
		classe2bis.afficherClasse();
	}
}