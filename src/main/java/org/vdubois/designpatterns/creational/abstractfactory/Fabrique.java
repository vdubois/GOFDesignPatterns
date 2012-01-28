package org.vdubois.designpatterns.creational.abstractfactory;

/**
 * Factory de classe abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Fabrique {

	/** 
	 * creerClasse
	 */
	public ClasseAbstraite creerClasse();
}