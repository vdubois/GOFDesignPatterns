package org.vdubois.designpatterns.behavioral.visitor;

/**
 * Interface d'un element pouvant etre visite
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Element {

	/** 
	 * recevoirVisiteur
	 * @param visiteur
	 */
	public void recevoirVisiteur(Visiteur visiteur);
}
