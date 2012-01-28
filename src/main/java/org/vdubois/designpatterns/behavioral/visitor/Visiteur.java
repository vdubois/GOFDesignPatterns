package org.vdubois.designpatterns.behavioral.visitor;

/**
 * Interface du Visiteur
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Visiteur {

	/** 
	 * visiterElementA
	 * @param element
	 */
	public void visiterElementA(ConcreteElementA element);

	/** 
	 * visiterElementB
	 * @param element
	 */
	public void visiterElementB(ConcreteElementB element);
}