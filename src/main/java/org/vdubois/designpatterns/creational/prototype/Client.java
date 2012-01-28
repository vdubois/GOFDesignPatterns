package org.vdubois.designpatterns.creational.prototype;

/**
 * Classe de test du design pattern Prototype
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Prototype prototype1 = new PrototypeConcretA("Original 1");
		Prototype prototype2 = new PrototypeConcretA("Original 2");
		
		Prototype prototype1Clone = prototype1.clone();
		Prototype prototype2Clone = prototype2.clone();
		
		System.out.println(prototype1);
		System.out.println(prototype1Clone);
		System.out.println(prototype2);
		System.out.println(prototype2Clone);
		
		prototype1Clone.setTexte("Clone 1");
		prototype2Clone.setTexte("Clone 2");
		
		System.out.println(prototype1);
		System.out.println(prototype1Clone);
		System.out.println(prototype2);
		System.out.println(prototype2Clone);		
	}
}
