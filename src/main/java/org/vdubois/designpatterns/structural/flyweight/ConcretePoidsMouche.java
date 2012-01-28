package org.vdubois.designpatterns.structural.flyweight;

/**
 * Implementation d'un Poids mouche partage
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcretePoidsMouche implements PoidsMouche {

	/** 
	 * valeur
	 */
	private String valeur;

	/** 
	 * Constructeur
	 * @param valeur
	 */
	public ConcretePoidsMouche(String valeur) {
		this.valeur = valeur;
	}

	/** 
	 * @see PoidsMouche#afficher(String contexte)
	 */
	public void afficher(String contexte) {
		System.out.println("PoidsMouche avec la valeur : " + valeur + " et contexte : " + contexte);
	}
}
