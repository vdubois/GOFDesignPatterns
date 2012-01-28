package org.vdubois.designpatterns.behavioral.strategy;

/**
 * Classe qui utilise la strategie
 * @author Vincent Dubois
 * @version 1.0
 */
public class ClasseUtilisantStrategie {

	/** 
	 * strategie
	 */
	private Strategie strategie;

	/**
	 * Constructeur 
	 * @param strategie
	 */
	public ClasseUtilisantStrategie(Strategie strategie) {
		this.strategie = strategie;
	}

	/** 
	 * operation
	 */
	public void operation() {
		System.out.println("Execution de la methode");
		System.out.println("On peut utiliser ce design pattern en combinaison avec le design pattern patron de methode");
		System.out.println("-> La classe patron implemente alors l'interface Strategie");
		strategie.operationStrategie();
	}
}
