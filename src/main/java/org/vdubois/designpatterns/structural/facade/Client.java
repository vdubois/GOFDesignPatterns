package org.vdubois.designpatterns.structural.facade;

/**
 * Classe de test du design pattern Facade
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.operation2();
		facade.operation41();
	}
}
