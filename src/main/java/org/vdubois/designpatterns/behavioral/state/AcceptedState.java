package org.vdubois.designpatterns.behavioral.state;


/**
 * Etat accepte
 * @author Vincent Dubois
 * @version 1.0
 */
public class AcceptedState implements State {

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#getStatus()
	 */
	public String getStatus() {
		return "Request Received";
	}

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#grantPermission(org.vdubois.designpatterns.behavioral.state.StateContext)
	 */
	public void grantPermission(StateContext stateContext) {
		// ne rien faire
	}

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#requestPermission(org.vdubois.designpatterns.behavioral.state.StateContext)
	 */
	public void requestPermission(StateContext stateContext) {
		System.out.println("Requesting permission");
		stateContext.setState(new RequestedState());
	}

}
