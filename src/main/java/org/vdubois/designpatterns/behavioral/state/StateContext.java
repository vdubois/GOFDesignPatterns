package org.vdubois.designpatterns.behavioral.state;


/**
 * Classe gerant l'etat
 * @author Vincent Dubois
 * @version 1.0
 */
public class StateContext {

	/**
	 * Etat en cours d'utilisation
	 */
	private State state;
	
	/**
	 * Constructeur
	 */
	public StateContext() {
		state = null;
	}
	
	/**
	 * acceptApplication
	 */
	public void acceptApplication() {
		this.state = new AcceptedState();
	}
	
	/**
	 * requestPermission
	 */
	public void requestPermission() {
		state.requestPermission(this);
	}
	
	/**
	 * grantPermission
	 */
	public void grantPermission() {
		state.grantPermission(this);
	}
	
	/**
	 * @return l'etat en cours sous forme de texte
	 */
	public String getStatus() {
		return state.getStatus();
	}
	
	/**
	 * setState
	 * @param state l'etat
	 */
	public void setState(State state) {
		this.state = state;
	}
}
