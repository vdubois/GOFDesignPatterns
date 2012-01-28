package org.vdubois.designpatterns.behavioral.chainofresponsibility;

/**
 * Implementation de maillon
 * @author Vincent Dubois
 * @version 1.0
 */
public class MaillonC extends Maillon {

	/** 
	 * @see Maillon#operationSpec(int nombre)
	 */
	public boolean operationSpec(int nombre) {
		boolean isNombreGere = true;
		if (nombre > 2) {
			System.out.println("MaillonC : " + nombre + " : > 2");
			isNombreGere = true;
		}
		return isNombreGere;
	}
}
