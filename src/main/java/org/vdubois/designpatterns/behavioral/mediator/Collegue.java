package org.vdubois.designpatterns.behavioral.mediator;

/**
 * Classe abstraite representant un objet collegue
 * Les objets collegues communiquent entrent eux via le Mediateur
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Collegue {

	/** 
	 * mediateur
	 */
	protected Mediateur mediateur;

	/** 
	 * Constructeur
	 * @param mediateur
	 */
	public Collegue(Mediateur mediateur) {
		this.mediateur = mediateur;
	}

	/** 
	 * recevoirMessage
	 * @param message
	 */
	public abstract void recevoirMessage(String message);
}
