package org.vdubois.designpatterns.creational.factory;


/**
 * Implementation de fabrique de classe abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public class FabriqueB implements Fabrique {

	/** 
	 * @see Fabrique#creerClasse()
	 */
	public ClasseAbstraite creerClasse() {
		return new ClasseB();
	}
}
