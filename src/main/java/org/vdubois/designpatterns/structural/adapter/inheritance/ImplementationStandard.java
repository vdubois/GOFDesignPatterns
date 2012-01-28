package org.vdubois.designpatterns.structural.adapter.inheritance;

/**
 * Implémentation standard
 * @author Vincent Dubois
 * @version 1.0
 */
public class ImplementationStandard implements Standard {

	/** 
	 * @see Standard#operation(int nombre1, int nombre2)
	 */
	public void operation(int nombre1, int nombre2) {
		System.out.println("Standard : le nombre est : " + (nombre1 * nombre2));
	}
}
