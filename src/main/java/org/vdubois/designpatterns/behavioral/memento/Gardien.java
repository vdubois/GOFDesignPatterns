package org.vdubois.designpatterns.behavioral.memento;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe qui conserve les Memento (sauvegarde/restauration)
 * @author Vincent Dubois
 * @version 1.0
 */
public class Gardien {

	/** 
	 * liste
	 */
	private List<Memento> mementos = new LinkedList<Memento>();

	/** 
	 * ajouterMemento
	 * @param memento
	 */
	public void ajouterMemento(Memento memento) {
		mementos.add(memento);
	}

	/** 
	 * getMemento
	 * @param index
	 * @return le memento d'index donne
	 */
	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
