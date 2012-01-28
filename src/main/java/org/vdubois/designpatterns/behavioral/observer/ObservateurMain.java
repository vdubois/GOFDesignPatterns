package org.vdubois.designpatterns.behavioral.observer;


/**
 * Classe de test du design pattern observateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class ObservateurMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConcreteObservable objetObserve = new ConcreteObservable();
		
		ConcreteObservateur observateur = new ConcreteObservateur();

		objetObserve.ajouterObservateur(observateur);
		observateur.setObservable(objetObserve);
		
		objetObserve.setValeur(4);
		objetObserve.setValeur(16);
		objetObserve.setValeur(1);
	}

}
