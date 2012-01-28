package org.vdubois.designpatterns.behavioral.state;


/**
 * Etat autorise
 * @author Vincent Dubois
 * @version 1.0
 */
public class GrantedState implements State {

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#getStatus()
	 */
	public String getStatus() {
		return "Granted";
	}

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#grantPermission(org.vdubois.designpatterns.behavioral.state.StateContext)
	 */
	public void grantPermission(StateContext stateContext) {
		System.out.println("Already granted");
	}

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#requestPermission(org.vdubois.designpatterns.behavioral.state.StateContext)
	 */
	public void requestPermission(StateContext stateContext) {
		System.out.println("Already requested thus granted");
	}

}
