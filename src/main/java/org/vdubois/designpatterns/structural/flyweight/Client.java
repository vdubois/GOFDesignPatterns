package org.vdubois.designpatterns.structural.flyweight;


/**
 * Classe de test du desigjn pattern Poids-mouche
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PoidsMoucheFabrique poidsMoucheFactory = new PoidsMoucheFabrique();
		
		// Demande des "PoidsMouche" qui sont partages
		PoidsMouche poidsMouche1 = poidsMoucheFactory.getPoidsMouche("Bonjour");
		PoidsMouche poidsMouche1Bis = poidsMoucheFactory.getPoidsMouche("Bonjour");

		// Affiche ces deux "PoidsMouche"
		poidsMouche1.afficher("Contexte1");
		poidsMouche1Bis.afficher("Contexte1Bis");
	
		// Affiche si les references pointent sur la meme instance
		// Cela est logique puisque c'est le principe de l'instance partagee.
		System.out.print("poidsMouche1 == poidsMouche1Bis : ");
		System.out.println(poidsMouche1 == poidsMouche1Bis);
		
		// Demande un "PoidsMouche" qui ne fait pas partie des existants
		PoidsMouche poidsMouche2 = poidsMoucheFactory.getPoidsMouche("BonjouR");
		PoidsMouche poidsMouche2Bis = poidsMoucheFactory.getPoidsMouche("BonjouR");
		
		// Affiche ces deux "PoidsMouche"
		poidsMouche2.afficher("Contexte2");
		poidsMouche2Bis.afficher("Contexte2Bis");
		
		// Demande et affiche un "PoidsMouche" non partage
		PoidsMouche poidsMouche3 = poidsMoucheFactory.getPoidsMouche("Valeur1", "Valeur2");
		poidsMouche3.afficher(null);
	}
}
