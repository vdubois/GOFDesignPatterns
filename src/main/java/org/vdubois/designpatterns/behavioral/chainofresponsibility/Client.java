package org.vdubois.designpatterns.behavioral.chainofresponsibility;

/**
 * Classe de test du design pattern chaine de responsabilite
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Maillon maillon1 = new MaillonA();
		Maillon maillon2 = new MaillonB();
		Maillon maillon3 = new MaillonC();
		
		maillon1.setSuivant(maillon2);
		maillon2.setSuivant(maillon3);

		System.out.println("--> Appel de la methode avec parametre '1' : ");
		maillon1.operation(1);
		System.out.println("--> Appel de la methode avec parametre '2' : ");
		maillon1.operation(2);
		System.out.println("--> Appel de la methode avec parametre '3' : ");
		maillon1.operation(3);
		System.out.println("--> Appel de la methode avec parametre '4' : ");
		maillon1.operation(4);
	}
}
