package org.vdubois.designpatterns.creational.builder;

/**
 * Le monteur
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class Monteur {

	/** 
	 * objetComplexe
	 */
	protected ObjetComplexe objetComplexe;

	/** 
	 * @return l'objet complexe
	 */
	public ObjetComplexe getObjet() {
		return objetComplexe;
	}

	/** 
	 * creerObjet
	 */
	public void creerObjet() {
		this.objetComplexe = new ObjetComplexe();
	}

	/** 
	 * creerAttribut1
	 * @param attribut
	 */
	public abstract void creerAttribut1(String attribut);

	/** 
	 * creerAttribut2
	 * @param attribut
	 */
	public abstract void creerAttribut2(double attribut);
}