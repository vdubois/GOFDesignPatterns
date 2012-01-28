package org.vdubois.designpatterns.creational.prototype;

/**
 * Classe prototype
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Prototype implements Cloneable {

	/** 
	 * texte
	 */
	protected String texte;

	/** 
	 * Constructeur
	 * @param texte
	 */
	public Prototype(String texte) {
		this.texte = texte;
	}

	/** 
	 * @return un clone du prototype
	 * @throws CloneNotSupportedException
	 */
	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}

	/**
	 * Setter de l'attribut texte
	 * @param texte La valeur a positionner
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return texte;
	}
}
