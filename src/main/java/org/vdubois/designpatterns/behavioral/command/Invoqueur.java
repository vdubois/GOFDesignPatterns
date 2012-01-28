package org.vdubois.designpatterns.behavioral.command;

/**
 * Invoqueur de commandes
 * @author Vincent Dubois
 * @version 1.0
 */
public class Invoqueur {

	/** 
	 * commandeA
	 */
	private Commande commandeA;

	/** 
	 * commandeB
	 */
	private Commande commandeB;

	
	/**
	 * Setter de l'attribut commandeA
	 * @param commandeA La valeur a positionner
	 */
	public void setCommandeA(Commande commandeA) {
		this.commandeA = commandeA;
	}

	
	/**
	 * Setter de l'attribut commandeB
	 * @param commandeB La valeur a positionner
	 */
	public void setCommandeB(Commande commandeB) {
		this.commandeB = commandeB;
	}
	
	/**
	 * invoquerA
	 */
	public void invoquerA() {
		if (commandeA != null) {
			commandeA.executer();
		}
	}

	/**
	 * invoquerB
	 */
	public void invoquerB() {
		if (commandeB != null) {
			commandeB.executer();
		}
	}
}
