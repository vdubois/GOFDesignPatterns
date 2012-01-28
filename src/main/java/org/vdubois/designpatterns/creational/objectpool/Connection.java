package org.vdubois.designpatterns.creational.objectpool;


/**
 * Objet connexion gere par le pool de connexions
 * @author Vincent Dubois
 * @version 1.0
 */
public class Connection {

	/**
	 * connexion fermee ?
	 */
	private boolean closed = true;
	
	/**
	 * @return true si la connexion est fermee, false sinon
	 */
	public boolean isClosed() {
		return closed;
	}
	
	/**
	 * Ouverture de connexion
	 */
	public void open() {
		System.out.println("Ouverture de la connexion pour " + this);
		closed = false;
	}

	/**
	 * Ouverture de connexion
	 */
	public void close() {
		System.out.println("Fermeture de la connexion pour " + this);
		closed = true;
	}
	
	/**
	 * operation
	 */
	public void operation() {
		System.out.println("Operation utilisateur pour " + this);
	}
}
