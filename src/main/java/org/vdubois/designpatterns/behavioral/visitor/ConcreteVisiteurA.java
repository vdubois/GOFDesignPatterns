package org.vdubois.designpatterns.behavioral.visitor;

/**
 * Implementation concrete d'un visiteur
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteVisiteurA implements Visiteur {

	/** 
	 * @see Visiteur#visiterElementA(ConcreteElementA element)
	 */
	public void visiterElementA(ConcreteElementA element) {
		System.out.println("Visiteur A : ");
		System.out.println(" Texte de l'element A : " + element.getTexte());
	}

	/** 
	 * @see Visiteur#visiterElementB(ConcreteElementB element)
	 */
	public void visiterElementB(ConcreteElementB element) {
		System.out.println("Visiteur A : ");
		System.out.println(" Valeur de l'element B : " + element.getValeur());
	}
}
