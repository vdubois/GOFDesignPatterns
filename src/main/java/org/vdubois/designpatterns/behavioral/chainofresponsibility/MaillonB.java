package org.vdubois.designpatterns.behavioral.chainofresponsibility;

/**
 * Implementation de maillon
 * @author Vincent Dubois
 * @version 1.0
 */
public class MaillonB extends Maillon {

	/** 
	 * @see Maillon#operationSpec(int nombre)
	 */
	public boolean operationSpec(int nombre) {
		boolean isNombreGere = false;
		if (nombre < 2) {
			System.out.println("MaillonB : " + nombre + " : < 2");
			isNombreGere = true;
		}
		return isNombreGere;
	}
}
