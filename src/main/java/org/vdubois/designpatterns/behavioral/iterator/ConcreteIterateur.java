package org.vdubois.designpatterns.behavioral.iterator;


/**
 * Implementation de l'iterateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteIterateur implements Iterateur {

	/** 
	 * elements
	 */
	private String[] elements;

	/** 
	 * index de parcours
	 */
	private int index;

	/** 
	 * Constructeur
	 * @param elements
	 */
	public ConcreteIterateur(String[] elements) {
		this.elements = elements;
		this.index = 0;
	}

	/** 
	 * @see Iterateur#suivant()
	 */
	public String suivant() {
		return elements[index++];
	}

	/** 
	 * @see Iterateur#fini()
	 */
	public boolean fini() {
		return index > elements.length - 1;
	}
}
