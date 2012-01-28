package org.vdubois.designpatterns.behavioral.memento;

/**
 * Classe qui sauvegarde dans un Memento ou restitue depuis un Memento son etat 
 * @author Vincent Dubois
 * @version 1.0
 */
public class Createur {

	/** 
	 * etat
	 */
	private int etat = 2;

	/** 
	 * sauverDansMemento
	 * @param etat
	 * @return le Memento sauvegarde
	 */
	public Memento sauverDansMemento() {
		return new Memento(etat);
	}

	/** 
	 * restaurerDepuisMemento
	 * @param memento
	 */
	public void restaurerDepuisMemento(Memento memento) {
		etat = memento.getEtat();
	}
	
	/**
	 * suivant
	 */
	public void suivant() {
		etat = etat * etat;
	}
	
	/**
	 * afficher
	 */
	public void afficher() {
		System.out.println("L'etat vaut : " + etat);
	}
}
