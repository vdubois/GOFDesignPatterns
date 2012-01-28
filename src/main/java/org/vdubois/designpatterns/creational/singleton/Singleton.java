package org.vdubois.designpatterns.creational.singleton;

/**
 * Classe singleton
 * @author Vincent Dubois
 * @version 1.0
 */
public class Singleton {

	/** 
	 * instance
	 */
	private static Singleton instance;

	static {
		instance = new Singleton();
	}
	
	/** 
	 * Constructeur
	 */
	private Singleton() {
	}

	/** 
	 * @return instance
	 */
	public static Singleton getInstance() {
		return instance;
	}
}
