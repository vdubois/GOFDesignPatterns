package org.vdubois.designpatterns.behavioral.state;


/**
 * Interface etat
 * @author Vincent Dubois
 * @version 1.0
 */
public interface State {

	/**
	 * grantPermission
	 * @param stateContext
	 */
	public void grantPermission(StateContext stateContext);

	/**
	 * requestPermission
	 * @param stateContext
	 */
	public void requestPermission(StateContext stateContext);

	/**
	 * getStatus
	 * @return l'etat courant
	 */
	public String getStatus();
}
