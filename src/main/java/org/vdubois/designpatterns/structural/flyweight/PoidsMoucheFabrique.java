package org.vdubois.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Fabrique de poids mouche
 * @author Vincent Dubois
 * @version 1.0
 */
public class PoidsMoucheFabrique {

	/** 
	 * poidsMouchesPartages
	 */
	private Map<String, PoidsMouche> poidsMouchesPartages = new HashMap<String, PoidsMouche>();

	/** 
	 * Constructeur
	 */
	PoidsMoucheFabrique() {
		poidsMouchesPartages.put("Bonjour", new ConcretePoidsMouche("Bonjour"));
		poidsMouchesPartages.put("le", new ConcretePoidsMouche("le"));
		poidsMouchesPartages.put("monde", new ConcretePoidsMouche("monde"));
	}
	
	/** 
	 * getPoidsMouche
	 * @param valeur identifiant du poids mouche partage
	 * @return le poids mouche partage
	 */
	public PoidsMouche getPoidsMouche(String valeur) {
		PoidsMouche poidsMouche = null;
		if (poidsMouchesPartages.containsKey(valeur)) {
			System.out.println("--> Retourne un PoidsMouche (" + valeur + ") partage deja existant");
			poidsMouche = poidsMouchesPartages.get(valeur);
		}
		else {
			System.out.println("--> Retourne un PoidsMouche (" + valeur + ") partage non deja existant");
			poidsMouche = new ConcretePoidsMouche(valeur);
			poidsMouchesPartages.put(valeur, poidsMouche);
		}
		return poidsMouche;
	}

	/** 
	 * getPoidsMouche
	 * @param valeur1
	 * @param valeur2
	 * @return le poids mouche non partage
	 */
	public PoidsMouche getPoidsMouche(String valeur1, String valeur2) {
		System.out.println("--> Retourne un PoidsMouche (" + valeur1 + ", " + valeur2 + ") non partage");
		return new ConcretePoidsMoucheNonPartage(valeur1, valeur2);
	}
}
