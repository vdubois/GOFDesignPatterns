package org.vdubois.designpatterns.behavioral.observer;

/**
 * Implementation concrete de l'observateur
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteObservateur implements Observateur {

	/** 
	 * observable
	 */
	private ConcreteObservable observable;

	/** 
	 * valeurObservee
	 */
	private int valeurObservee;

	
	/**
	 * Setter de l'attribut observable
	 * @param observable La valeur a positionner
	 */
	public void setObservable(ConcreteObservable observable) {
		this.observable = observable;
	}

	/** 
	 * @see Observateur#miseAJour()
	 */
	public void miseAJour() {
		valeurObservee = observable.getValeur();
		System.out.println("Valeur changee : " + valeurObservee);
	}
	
	/**
	 * afficher
	 */
	public void afficher() {
	}
}
