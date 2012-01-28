package org.vdubois.designpatterns.creational.builder;

/**
 * Classe qui dirige la construction de l'objet complexe
 * @author Vincent Dubois
 * @version 1.0
 */
public class Directeur {

	/** 
	 * le monteur
	 */
	private Monteur monteur;

	/**
	 * Constructeur 
	 * @param monteur
	 */
	public Directeur(Monteur monteur) {
		this.monteur = monteur;
	}

	/** 
	 * @return l'objet cree
	 */
	public ObjetComplexe creerObjet() {
		monteur.creerObjet();
		monteur.creerAttribut1("test");
		monteur.creerAttribut2(12);
		return monteur.getObjet();
	}
}
