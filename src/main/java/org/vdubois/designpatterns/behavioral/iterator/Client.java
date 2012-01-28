package org.vdubois.designpatterns.behavioral.iterator;

/**
 * Classe de test du design pattern iterateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	public static void main(String[] args) {
		
		Compose compose = new ConcreteCompose();
		Iterateur iterateur = compose.creerIterateur();

		while(!iterateur.fini()) {
			System.out.println(iterateur.suivant());
		}
	}
}
