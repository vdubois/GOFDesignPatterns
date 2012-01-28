package org.vdubois.designpatterns.behavioral.strategy;

/**
 * Implementation A de la strategie
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConcreteStrategieA implements Strategie {

	/** 
	 * @see Strategie#operationStrategie()
	 */
	public void operationStrategie() {
		System.out.println("Operation de la strategie A");
	}
}
