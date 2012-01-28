package org.vdubois.designpatterns.structural.adapter.inheritance;

/**
 * Implémentation de l'adapté
 * @author Vincent Dubois
 * @version 1.0
 */
public class ImplementationAdapte {

	/** 
	 * @param nombre1
	 * @param nombre2
	 * @return le résultat de l'opération
	 */
	public int operationAdapte1(int nombre1, int nombre2) {
		return nombre1 * nombre2;
	}

	/** 
	 * @param nombre
	 */
	public void operationAdapte2(int nombre) {
		System.out.println("Adapte : le nombre est : " + nombre);
	}
}
