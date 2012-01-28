package org.vdubois.designpatterns.creational.abstractfactory;

import org.vdubois.designpatterns.creational.abstractfactory.ClasseAbstraite;


/**
 * Classe de test du design pattern Fabrique abstraite
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final Fabrique fabriqueA = new FabriqueConcreteA();
		final Fabrique fabriqueB = new FabriqueConcreteB();
		
		final ClasseAbstraite classe1 = fabriqueA.creerClasse();
		final ClasseAbstraite classe2 = fabriqueB.creerClasse();
		System.out.println(classe1);
		System.out.println(classe2);
	}
}