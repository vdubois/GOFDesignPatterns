package org.vdubois.designpatterns.behavioral.iterator;


/**
 * Interface du compose
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteCompose implements Compose {

	/** 
	 * elements
	 */
	private String[] elements = {"Bonjour", "le", "monde"};

	/** 
	 * @see Compose#creerIterateur()
	 */
	public Iterateur creerIterateur() {
		return new ConcreteIterateur(elements);
	}
}
