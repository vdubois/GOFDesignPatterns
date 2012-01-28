package org.vdubois.designpatterns.creational.abstractfactory;


/**
 * Factory concrete
 * @author Vincent Dubois
 * @version 1.0
 */
public class FabriqueConcreteB implements Fabrique {

	/** 
	 * @see Fabrique#creerClasse()
	 */
	public ClasseAbstraite creerClasse() {
		return new ClasseB();
	}
}
