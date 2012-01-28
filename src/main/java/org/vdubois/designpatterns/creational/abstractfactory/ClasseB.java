package org.vdubois.designpatterns.creational.abstractfactory;

/**
 * Implementation de la classe abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public class ClasseB implements ClasseAbstraite {

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Objet de la classe ".concat(getClass().getName()); 
	}
}
