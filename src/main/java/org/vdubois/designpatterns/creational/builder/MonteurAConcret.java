package org.vdubois.designpatterns.creational.builder;

/**
 * Monteur concret
 * @author Vincent Dubois
 * @version 1.0
 */
public class MonteurAConcret extends Monteur {

	/** 
	 * @see Monteur#creerAttribut1(String attribut)
	 */
	public void creerAttribut1(String attribut) {
		objetComplexe.setAttribut1(attribut.concat(" avec dimensions en pixels"));
	}

	/** 
	 * @see Monteur#creerAttribut2(double attribut)
	 */
	public void creerAttribut2(double attribut) {
		objetComplexe.setAttribut2(Double.valueOf(attribut * 2.54));
	}
}