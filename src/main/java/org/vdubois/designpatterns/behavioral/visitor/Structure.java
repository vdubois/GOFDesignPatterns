package org.vdubois.designpatterns.behavioral.visitor;


/**
 * Classe structure contenant les elements a visiter
 * @author Vincent Dubois
 * @version 1.0
 */
public class Structure {

	/** 
	 * elements
	 */
	private Element[] elements = {
		new ConcreteElementA("texte1"),
		new ConcreteElementA("texte2"),
		new ConcreteElementB(new Long(1)),
		new ConcreteElementA("texte3"),
		new ConcreteElementB(new Long(2)),
		new ConcreteElementB(new Long(3))};
	
	/**
	 * visiter
	 * @param visiteur
	 */
	public void visiter(Visiteur visiteur) {
		for (Element element : elements) {
			element.recevoirVisiteur(visiteur);
		}
	}
}
