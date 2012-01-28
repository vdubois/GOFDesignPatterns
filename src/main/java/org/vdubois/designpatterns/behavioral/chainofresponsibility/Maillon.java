package org.vdubois.designpatterns.behavioral.chainofresponsibility;

/**
 * Classe abstraite representant un maillon de la chaine de responsabilite
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Maillon {

	/** 
	 * maillon suivant dans la chaine
	 */
	private Maillon suivant;

	/** 
	 * setSuivant
	 * @param suivant
	 */
	public void setSuivant(Maillon suivant) {
		this.suivant = suivant;
	}

	/** 
	 * operation
	 * @param nombre
	 * @return boolean
	 */
	public boolean operation(int nombre) {
		if (operationSpec(nombre)) {
			return true;
		}
		if (suivant != null) {
			return suivant.operation(nombre);
		}
		return false;
	}

	/** 
	 * operationSpec
	 * @param nombre
	 * @return boolean
	 */
	public abstract boolean operationSpec(int nombre);
}
