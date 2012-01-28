package org.vdubois.designpatterns.structural.flyweight;

/**
 * Implementation d'un Poids mouche qui ne sera pas partage
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcretePoidsMoucheNonPartage implements PoidsMouche {

	/** 
	 * valeur1
	 */
	private String valeur1;

	/** 
	 * valeur2
	 */
	private String valeur2;

	/** 
	 * Constructeur
	 * @param valeur1
	 * @param valeur2
	 */
	public ConcretePoidsMoucheNonPartage(String valeur1, String valeur2) {
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
	}

	/** 
	 * @see PoidsMouche#afficher(String contexte)
	 */
	public void afficher(String contexte) {
		System.out.println("PoidsMouche avec la valeur1 : " + valeur1 + " avec la valeur2 : " + valeur2);
	}
}
