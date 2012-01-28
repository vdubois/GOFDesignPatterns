package org.vdubois.designpatterns.behavioral.memento;

/**
 * Memorisateur d'etat
 * @author Vincent Dubois
 * @version 1.0
 */
public class Memento {

	/** 
	 * etat memorise
	 */
	private int etat;

	/** 
	 * Constructeur
	 * @param etat
	 */
	public Memento(int etat) {
		this.etat = etat;
	}

	/** 
	 * @return etat
	 */
	public int getEtat() {
		return etat;
	}
}
