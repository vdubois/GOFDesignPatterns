package org.vdubois.designpatterns.creational.factory;

/**
 * Fabrique de classe abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Fabrique {

	/** 
	 * creerClasse
	 * @return la classe abstraite
	 */
	public ClasseAbstraite creerClasse();
}
