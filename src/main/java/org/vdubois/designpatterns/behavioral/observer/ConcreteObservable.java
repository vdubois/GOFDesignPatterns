package org.vdubois.designpatterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Implementation d'un objet observable
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteObservable implements Observable {

	/** 
	 * observateurs
	 */
	private List<Observateur> observateurs = new LinkedList<Observateur>();

	/** 
	 * valeur
	 */
	private int valeur;

	/** 
	 * @param valeur
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
		notifier();
	}

	/** 
	 * @return valeur
	 */
	public int getValeur() {
		return valeur;
	}

	/** 
	 * @see Observable#ajouterObservateur(Observateur observateur)
	 */
	public void ajouterObservateur(Observateur observateur) {
		observateurs.add(observateur);
	}

	/** 
	 * @see Observable#supprimerObservateur(Observateur observateur)
	 */
	public void supprimerObservateur(Observateur observateur) {
		observateurs.remove(observateur);
	}

	/** 
	 * @see Observable#notifier()
	 */
	public void notifier() {
		for (Observateur observateur : observateurs) {
			observateur.miseAJour();
		}
	}
}
