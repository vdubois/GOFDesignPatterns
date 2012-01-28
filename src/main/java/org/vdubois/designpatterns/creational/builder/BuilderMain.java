package org.vdubois.designpatterns.creational.builder;


/**
 * Classe de test du design pattern Monteur
 * @author Vincent Dubois
 * @version 1.0
 */
public class BuilderMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monteur monteur1 = new MonteurAConcret();
		Directeur directeur1 = new Directeur(monteur1);
		Monteur monteur2 = new MonteurBConcret();
		Directeur directeur2 = new Directeur(monteur2);
		
		ObjetComplexe objet1 = directeur1.creerObjet();
		ObjetComplexe objet2 = directeur2.creerObjet();
		
		System.out.println(objet1);
		System.out.println(objet2);
	}

}
