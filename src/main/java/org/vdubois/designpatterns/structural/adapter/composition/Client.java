package org.vdubois.designpatterns.structural.adapter.composition;

import org.vdubois.designpatterns.structural.adapter.inheritance.ImplementationStandard;
import org.vdubois.designpatterns.structural.adapter.inheritance.Standard;

/**
 * Classe de test du design pattern Adaptateur (en mode héritage)
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Standard standard = new ImplementationStandard();
		final Standard adaptateur = new Adaptateur(new ImplementationAdapte());

		standard.operation(2, 4);
		adaptateur.operation(2, 4);
	}
}
