package org.vdubois.designpatterns.behavioral.templatemethod;

/**
 * Classe de test du design pattern patron de methode
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final AbstractClasse classePatron = new ConcreteClasse();
		classePatron.operationTemplate();
	}
}
