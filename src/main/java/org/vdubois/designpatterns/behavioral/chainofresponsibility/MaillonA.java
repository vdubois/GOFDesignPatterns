package org.vdubois.designpatterns.behavioral.chainofresponsibility;

/**
 * Implementation de maillon
 * @author Vincent Dubois
 * @version 1.0
 */
public class MaillonA extends Maillon {

	/** 
	 * @see Maillon#operationSpec(int nombre)
	 */
	public boolean operationSpec(int nombre) {
		boolean isNombreGere = false;
		if(nombre % 2 == 0) {
			System.out.println("MaillonA : " + nombre + " : pair");
			isNombreGere = true;
		}
		return isNombreGere;
	}
}
