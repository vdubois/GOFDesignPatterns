package org.vdubois.designpatterns.structural.adapter.composition;

import org.vdubois.designpatterns.structural.adapter.inheritance.Standard;

/**
 * Classe adaptateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class Adaptateur implements Standard {

	/** 
	 * implementationAdapte
	 */
	private ImplementationAdapte implementationAdapte;

	/** 
	 * Constructeur
	 * @param implementationAdapte
	 */
	public Adaptateur(ImplementationAdapte implementationAdapte) {
		this.implementationAdapte = implementationAdapte;
	}

	/** 
	 * @see Standard#operation(int nombre1, int nombre2)
	 */
	public void operation(int nombre1, int nombre2) {
		int nombre = implementationAdapte.operationAdapte1(nombre1, nombre2);
		implementationAdapte.operationAdapte2(nombre);
	}
}
