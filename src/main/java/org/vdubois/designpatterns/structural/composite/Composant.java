package org.vdubois.designpatterns.structural.composite;

/**
 * Abstraction de composant d'une hiérarchie
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Composant {

	/** 
	 * nom
	 */
	protected String nom;

	/** 
	 * parent
	 */
	public Composite parent;

	/** 
	 * Constructeur
	 * @param nom
	 */
	public Composant(String nom) {
		this.nom = nom;
	}

	/** 
	 * operation
	 */
	public abstract void operation();
}
