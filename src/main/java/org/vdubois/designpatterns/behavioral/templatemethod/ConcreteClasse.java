package org.vdubois.designpatterns.behavioral.templatemethod;

/**
 * Implementation concrete 
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteClasse extends AbstractClasse {

	/** 
	 * @see AbstractClasse#operationAbs1()
	 */
	public void operationAbs1() {
		System.out.println("Methode concrete 1");
	}

	/** 
	 * @see AbstractClasse#operationAbs2()
	 */
	public void operationAbs2() {
		System.out.println("Methode concrete 2");
	}
}
