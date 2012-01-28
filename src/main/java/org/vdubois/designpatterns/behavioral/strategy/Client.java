package org.vdubois.designpatterns.behavioral.strategy;

/**
 * Classe de test du design pattern strategie
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClasseUtilisantStrategie classeUtilisantLaStrategie1 = 
			new ClasseUtilisantStrategie(new ConcreteStrategieA());
		ClasseUtilisantStrategie classeUtilisantLaStrategie2 = 
			new ClasseUtilisantStrategie(new ConcreteStrategieB());
		
		classeUtilisantLaStrategie1.operation();
		classeUtilisantLaStrategie2.operation();
	}
}
