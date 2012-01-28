package org.vdubois.designpatterns.creational.factory;

/**
 * Implementation de la classe abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public class ClasseA implements ClasseAbstraite {

	/** 
	 * @see ClasseAbstraite#afficherClasse()
	 */
	public void afficherClasse() {
		System.out.println(this);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Objet de la classe ".concat(getClass().getName());
	}
}
