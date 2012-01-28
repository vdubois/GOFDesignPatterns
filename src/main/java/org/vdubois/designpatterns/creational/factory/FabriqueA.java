package org.vdubois.designpatterns.creational.factory;


/**
 * Implementation de fabrique de classe abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public class FabriqueA implements Fabrique {

	/** 
	 * isClasseA
	 */
	private static boolean isClasseA;

	/** 
	 * @see Fabrique#creerClasse()
	 */
	public ClasseAbstraite creerClasse() {
		isClasseA = !isClasseA;
		ClasseAbstraite classe = null;
		if (isClasseA) {
			classe = new ClasseA();
		}
		else {
			classe = new ClasseB();
		}
		return classe;
	}
}
