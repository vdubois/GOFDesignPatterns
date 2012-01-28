package org.vdubois.designpatterns.behavioral.state;


/**
 * Etat demande
 * @author Vincent Dubois
 * @version 1.0
 */
public class RequestedState implements State {

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#getStatus()
	 */
	public String getStatus() {
		return "Requested permission";
	}

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#grantPermission(org.vdubois.designpatterns.behavioral.state.StateContext)
	 */
	public void grantPermission(StateContext stateContext) {
		System.out.println("Granting Permission");
		stateContext.setState(new GrantedState());
	}

	/** 
	 * @see org.vdubois.designpatterns.behavioral.state.State#requestPermission(org.vdubois.designpatterns.behavioral.state.StateContext)
	 */
	public void requestPermission(StateContext stateContext) {
		System.out.println("Permission already requested");
	}

}
