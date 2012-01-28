package org.vdubois.designpatterns.behavioral.mediator;


/**
 * Classe de test du design pattern Mediateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class MediateurMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Mediateur mediateur = new ConcreteMediateur();

		ConcreteCollegueA collegueA = new ConcreteCollegueA(mediateur);
		ConcreteCollegueB collegueB = new ConcreteCollegueB(mediateur);
		
		collegueA.envoyerMessageFromA("Coucou");
		collegueB.envoyerMessageFromB("Salut");
	}

}
