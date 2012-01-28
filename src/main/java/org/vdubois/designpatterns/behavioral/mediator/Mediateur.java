package org.vdubois.designpatterns.behavioral.mediator;

/**
 * Interface Mediateur
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Mediateur {

	/** 
	 * setCollegueA
	 * @param collegue
	 */
	public void setCollegueA(ConcreteCollegueA collegue);

	/** 
	 * setCollegueB
	 * @param collegue
	 */
	public void setCollegueB(ConcreteCollegueB collegue);

	/** 
	 * transmettreMessageFromA
	 * @param message
	 */
	public void transmettreMessageFromA(String message);

	/** 
	 * transmettreMessageFromB
	 * @param message
	 */
	public void transmettreMessageFromB(String message);
}
