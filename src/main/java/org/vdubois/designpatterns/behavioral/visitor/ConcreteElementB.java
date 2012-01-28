package org.vdubois.designpatterns.behavioral.visitor;

/**
 * Implementation d'un element pouvant etre visite
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteElementB implements Element {

	/** 
	 * valeur
	 */
	private Long valeur;

	/** 
	 * Constructeur
	 * @param valeur
	 */
	public ConcreteElementB(Long valeur) {
		this.valeur = valeur;
	}

	/** 
	 * getValeur
	 * @return valeur
	 */
	public Long getValeur() {
		return valeur;
	}

	/** 
	 * @see Element#recevoirVisiteur(Visiteur visiteur)
	 */
	public void recevoirVisiteur(Visiteur visiteur) {
		visiteur.visiterElementB(this);
	}
}
