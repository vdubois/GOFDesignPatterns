package org.vdubois.designpatterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Element composé d'une hiérarchie
 * @author Vincent Dubois
 * @version 1.0
 */
public class Composite extends Composant {

	/** 
	 * enfants
	 */
	private List<Composant> enfants = new LinkedList<Composant>();

	/**
	 * Constructeur
	 * @param nom
	 */
	public Composite(String nom) {
		super(nom);
	}

	/** 
	 * @return les enfants du composite
	 */
	public List<Composant> getEnfants() {
		return enfants;
	}

	/** 
	 * ajouter
	 * @param composant
	 */
	public void ajouter(Composant composant) {
		enfants.add(composant);
	}

	/** 
	 * retirer
	 * @param composant
	 */
	public void retirer(Composant composant) {
		enfants.remove(composant);
	}

	/** 
	 * @see Composant#operation()
	 */
	public void operation() {
		System.out.println("Op. sur un 'Composite' (" + nom + ")");
		for (Composant composant : enfants) {
			composant.operation();
		}
	}
}
