package org.vdubois.designpatterns.behavioral.visitor;

/**
 * Classe de test du design pattern Visiteur
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Visiteur visiteurA = new ConcreteVisiteurA();
		Visiteur visiteurB = new ConcreteVisiteurB();

		Structure structure = new Structure();
		
		structure.visiter(visiteurA);
		structure.visiter(visiteurB);
	}
}