package org.vdubois.designpatterns.behavioral.state;


/**
 * Classe de test du design pattern etat
 * @author Vincent Dubois
 * @version 1.0
 */
public class EtatMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StateContext stateContext = new StateContext();
		stateContext.acceptApplication();
		stateContext.requestPermission();
		stateContext.grantPermission();
		System.out.println(stateContext.getStatus());
	}

}
