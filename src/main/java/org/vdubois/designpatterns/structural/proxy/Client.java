package org.vdubois.designpatterns.structural.proxy;

/**
 * Classe de test du design pattern Proxy
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	public static void main(String[] args) {
		Abstraction proxy = new Proxy();
		proxy.afficher();
	}
}
