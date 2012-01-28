package org.vdubois.designpatterns.creational.singleton;


/**
 * Classe de test du design pattern Singleton
 * @author Vincent Dubois
 * @version 1.0
 */
public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Singleton singleton1 = Singleton.getInstance();
		final Singleton singleton2 = Singleton.getInstance();
		System.out.println("Les deux instances de singleton sont " + (singleton1 == singleton2 ? "egales" : "non egales"));
	}

}
