package org.vdubois.designpatterns.behavioral.mediator;

/**
 * Implementation concrete d'un collegue
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteCollegueA extends Collegue {

	/**
	 * Constructeur
	 * @param mediateur
	 */
	public ConcreteCollegueA(Mediateur mediateur) {
		super(mediateur);
		mediateur.setCollegueA(this);
	}

	/** 
	 * envoyerMessageFromA
	 * @param message
	 */
	public void envoyerMessageFromA(String message) {
		mediateur.transmettreMessageFromA(message);
	}

	/** 
	 * @see Collegue#recevoirMessage(String message)
	 */
	public void recevoirMessage(String message) {
		System.out.println("ConcreteCollegueA a recu : " + message);
	}
}
