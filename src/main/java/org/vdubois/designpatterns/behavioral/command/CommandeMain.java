package org.vdubois.designpatterns.behavioral.command;


/**
 * Classe de test du design pattern commande
 * @author Vincent Dubois
 * @version 1.0
 */
public class CommandeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Recepteur recepteurDeRequete = new Recepteur();

		Commande commande1 = new ConcreteCommandeA(recepteurDeRequete);
		Commande commande2 = new ConcreteCommandeB(recepteurDeRequete);

		Invoqueur invoqueur = new Invoqueur();
		invoqueur.setCommandeA(commande1);
		invoqueur.setCommandeB(commande2);
		
		// Appel des methodes d'invocation
		// NB : Cette classe represente la partie cliente.
		// Normalement l'invocation ne se passe pas dans la partie cliente
		// Dans l'exemple, elle est ici par souci de concision
		invoqueur.invoquerA();
		invoqueur.invoquerB();
	}

}
