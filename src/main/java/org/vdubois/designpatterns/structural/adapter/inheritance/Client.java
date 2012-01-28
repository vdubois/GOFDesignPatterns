package org.vdubois.designpatterns.structural.adapter.inheritance;

/**
 * Classe de test du design pattern Adaptateur (en mode composition)
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Standard adapte = new Adaptateur();
		final Standard standard = new ImplementationStandard();
		
		adapte.operation(2, 4);
		standard.operation(2, 4);
	}
}
