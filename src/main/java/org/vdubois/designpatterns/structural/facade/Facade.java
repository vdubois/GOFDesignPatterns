package org.vdubois.designpatterns.structural.facade;

/**
 * Facade
 * @author Vincent Dubois
 * @version 1.0
 */
public class Facade {

	/** 
	 * classeA
	 */
	private ClasseA classeA = new ClasseA();

	/** 
	 * classeB
	 */
	private ClasseB classeB = new ClasseB();

	/** 
	 * operation2
	 */
	public void operation2() {
		System.out.println("--> Methode operation2() de la classe Facade : ");
		classeA.operation2();
	}

	/** 
	 * operation41
	 */
	public void operation41() {
		System.out.println("--> Methode operation41() de la classe Facade : ");
		classeB.operation4();
		classeA.operation1();
	}
}
