package org.vdubois.designpatterns.behavioral.memento;

/**
 * Classe de test du design pattern Memento
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Gardien gardien = new Gardien();
		Createur createur = new Createur();
		
		gardien.ajouterMemento(createur.sauverDansMemento());
		
		createur.afficher();
		createur.suivant();
		
		gardien.ajouterMemento(createur.sauverDansMemento());
		
		createur.suivant();
		
		gardien.ajouterMemento(createur.sauverDansMemento());
		
		createur.afficher();
		
		Memento memento1 = gardien.getMemento(1);
		createur.restaurerDepuisMemento(memento1);
		
		createur.afficher();
	}
}