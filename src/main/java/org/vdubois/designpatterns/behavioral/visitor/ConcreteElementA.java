package org.vdubois.designpatterns.behavioral.visitor;

/**
 * Implementation d'un element pouvant etre visite
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteElementA implements Element {

	/** 
	 * texte
	 */
	private String texte;

	/** 
	 * Constructeur
	 * @param texte
	 */
	public ConcreteElementA(String texte) {
		this.texte = texte;
	}

	/** 
	 * getTexte
	 * @return texte
	 */
	public String getTexte() {
		return texte;
	}

	/** 
	 * @see Element#recevoirVisiteur(Visiteur visiteur)
	 */
	public void recevoirVisiteur(Visiteur visiteur) {
		visiteur.visiterElementA(this);
	}
}
