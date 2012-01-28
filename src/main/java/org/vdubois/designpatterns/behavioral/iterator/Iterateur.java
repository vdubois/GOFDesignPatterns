package org.vdubois.designpatterns.behavioral.iterator;

/**
 * Interface iterateur
 * @author Vincent Dubois
 * @version 1.0
 */
public interface Iterateur {

	/** 
	 * @return element suivant
	 */
	public String suivant();

	/** 
	 * @return true s'il y a un element suivant, false sinon
	 */
	public boolean fini();
}
