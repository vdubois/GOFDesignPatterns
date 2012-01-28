package org.vdubois.designpatterns.behavioral.command;

/**
 * Implementation de commande
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteCommandeB implements Commande {

	/** 
	 * recepteur
	 */
	private Recepteur recepteur;

	/** 
	 * Constructeur
	 * @param recepteur
	 */
	public ConcreteCommandeB(Recepteur recepteur) {
		this.recepteur = recepteur;
	}

	/** 
	 * @see Commande#executer()
	 */
	public void executer() {
		recepteur.action2();
	}
}
