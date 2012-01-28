package org.vdubois.designpatterns.creational.builder;

/**
 * L'objet complexe a construire
 * @author Vincent Dubois
 * @version 1.0
 */
public class ObjetComplexe {

	/** 
	 * attribut1
	 */
	private String attribut1;

	/** 
	 * attribut2
	 */
	private Double attribut2;

	/**
	 * Getter de l'attribut attribut1
	 * @return String Le valeur de l'attribut
	 */
	public String getAttribut1() {
		return attribut1;
	}

	/**
	 * Setter de l'attribut attribut1
	 * @param attribut1 La valeur a positionner
	 */
	public void setAttribut1(String attribut1) {
		this.attribut1 = attribut1;
	}

	/**
	 * Getter de l'attribut attribut2
	 * @return Double Le valeur de l'attribut
	 */
	public Double getAttribut2() {
		return attribut2;
	}

	/**
	 * Setter de l'attribut attribut2
	 * @param attribut2 La valeur a positionner
	 */
	public void setAttribut2(Double attribut2) {
		this.attribut2 = attribut2;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		final StringBuffer sb = new StringBuffer("Objet Complexe : ");
		sb.append("\n\t- attribut1 : ").append(attribut1);
		sb.append("\n\t- attribut2 : ").append(attribut2);
		sb.append("\n\t- classe de l'attribut2 : ").append(attribut2.getClass());
		return sb.toString();
	}
}
