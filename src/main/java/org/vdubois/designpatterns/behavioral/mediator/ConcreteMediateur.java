package org.vdubois.designpatterns.behavioral.mediator;

/**
 * Implementation de Mediateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteMediateur implements Mediateur {

	/** 
	 * collegueA
	 */
	private ConcreteCollegueA collegueA;

	/** 
	 * collegueB
	 */
	private ConcreteCollegueB collegueB;

	/** 
	 * @see Mediateur#setCollegueA(Collegue collegue)
	 */
	public void setCollegueA(ConcreteCollegueA collegue) {
		this.collegueA = collegue;
	}

	/** 
	 * @see Mediateur#setCollegueB(Collegue collegue)
	 */
	public void setCollegueB(ConcreteCollegueB collegue) {
		this.collegueB = collegue;
	}

	/** 
	 * @see Mediateur#transmettreMessageFromA(String message)
	 */
	public void transmettreMessageFromA(String message) {
		collegueB.recevoirMessage(message);
	}

	/** 
	 * @see Mediateur#transmettreMessageFromB(String message)
	 */
	public void transmettreMessageFromB(String message) {
		collegueA.recevoirMessage(message);
	}
}
