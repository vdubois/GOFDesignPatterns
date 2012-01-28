package org.vdubois.designpatterns.behavioral.templatemethod;

/**
 * Classe abstraite patron de methode
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class AbstractClasse {

	/** 
	 * operationTemplate
	 */
	public void operationTemplate() {
		System.out.println("Methode template");
		for (int i = 0; i < 5; i++) {
			operationAbs1();
		}
		operationAbs2();
	}

	/** 
	 * operationAbs1
	 */
	public abstract void operationAbs1();

	/** 
	 * operationAbs2
	 */
	public abstract void operationAbs2();
}
