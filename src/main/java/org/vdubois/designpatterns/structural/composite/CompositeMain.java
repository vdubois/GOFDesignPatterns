package org.vdubois.designpatterns.structural.composite;


/**
 * Classe de test du design pattern composite
 * @author Vincent Dubois
 * @version 1.0
 */
public class CompositeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Composite composite1 = new Composite("Composite 1");
		final Composite composite2 = new Composite("Composite 2");
		final Composite composite3 = new Composite("Composite 3");
		final Composite composite4 = new Composite("Composite 4");
		final Composite composite5 = new Composite("Composite 5");
		
		final Element element1 = new Element("Element 1");
		final Element element2 = new Element("Element 2");
		final Element element3 = new Element("Element 3");
		final Element element4 = new Element("Element 4");
		final Element element5 = new Element("Element 5");
		
		composite1.ajouter(element1);
		composite1.ajouter(composite2);
		composite1.ajouter(element2);
		composite2.ajouter(composite3);
		composite2.ajouter(composite4);
		composite3.ajouter(element3);
		composite3.ajouter(element4);
		composite4.ajouter(composite5);
		composite5.ajouter(element5);

		composite1.operation();
	}
}
