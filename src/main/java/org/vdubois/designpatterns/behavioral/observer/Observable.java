package org.vdubois.designpatterns.behavioral.observer;

/**
 * Interface pour un objet observable
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Observable {

	/** 
	 * @param observateur
	 */
	public void ajouterObservateur(Observateur observateur);

	/** 
	 * @param observateur
	 */
	public void supprimerObservateur(Observateur observateur);

	/** 
	 * notifier les observateurs
	 */
	public void notifier();
}