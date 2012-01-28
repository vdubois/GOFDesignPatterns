package org.vdubois.designpatterns.behavioral.mediator;

/**
 * Implementation concrete d'un collegue
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteCollegueB extends Collegue {

	/**
	 * Constructeur
	 * @param mediateur
	 */
	public ConcreteCollegueB(Mediateur mediateur) {
		super(mediateur);
		mediateur.setCollegueB(this);
	}

	/** 
	 * envoyerMessageFromB
	 * @param message
	 */
	public void envoyerMessageFromB(String message) {
		mediateur.transmettreMessageFromB(message);
	}

	/** 
	 * @see Collegue#recevoirMessage(String message)
	 */
	public void recevoirMessage(String message) {
		System.out.println("ConcreteCollegueB a recu : " + message);
	}
}
