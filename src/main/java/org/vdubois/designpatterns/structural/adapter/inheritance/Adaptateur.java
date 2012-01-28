package org.vdubois.designpatterns.structural.adapter.inheritance;

/**
 * Classe adaptateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class Adaptateur extends ImplementationAdapte implements Standard {

	/** 
	 * @see Standard#operation(int nombre1, int nombre2)
	 */
	public void operation(int nombre1, int nombre2) {
		int nombre = operationAdapte1(nombre1, nombre2);
		operationAdapte2(nombre);
	}
}
