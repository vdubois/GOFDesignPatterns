package org.vdubois.designpatterns.structural.composite;

/**
 * Element "feuille" d'une hiérarchie
 * @author Vincent Dubois
 * @version 1.0
 */
public class Element extends Composant {

	/**
	 * Constructeur
	 * @param nom
	 */
	public Element(String nom) {
		super(nom);
	}

	/** 
	 * @see Composant#operation()
	 */
	public void operation() {
		System.out.println("Op. sur un 'Element' (" + nom + ")");
	}
}
