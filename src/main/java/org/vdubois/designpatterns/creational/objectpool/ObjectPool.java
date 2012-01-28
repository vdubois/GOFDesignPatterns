package org.vdubois.designpatterns.creational.objectpool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * Implementation d'un pool d'objets
 * @author Vincent Dubois
 * @version 1.0
 */
public abstract class ObjectPool<T> {

	/** 
	 * Temps d'expiration du pool
	 */
	private long expirationTime;

	/**
	 * Objets verrouilles ou disponibles
	 */
	private Map<T, Long> locked, unlocked;

	/**
	 * Constructeur
	 */
	public ObjectPool() {
	    expirationTime = 30000;
	    locked = new HashMap<T, Long>();
	    unlocked = new HashMap<T, Long>();
	}

	/**
	 * Creation d'un objet quand il n'y en a plus de disponible
	 * @return l'objet cree
	 */
	protected abstract T create();

	/**
	 * @param o l'objet passe en parametre
	 * @return true si l'objet est considere comme valide, false sinon
	 */
	public abstract boolean validate(T o);

	/**
	 * Expiration d'un objet 
	 * @param o l'objet a faire expirer
	 */
	public abstract void expire(T o);

	/**
	 * Recuperation d'un objet du pool
	 * @return l'objet recupere du pool
	 */
	public synchronized T aquireObject() {
	    final long now = System.currentTimeMillis();
	    T object;
	    if (unlocked.size() > 0) {
	    	Set<T> e = unlocked.keySet();
	    	Iterator<T> ite = e.iterator();
	    	while (ite.hasNext()) {
	    		object = ite.next();
	    		if ((now - unlocked.get(object)) > expirationTime) {
	    			// l'objet a expire
	    			System.out.println("Expiration de l'objet " + object);
	    			unlocked.remove(object);
	    			expire(object);
	    			object = null;
	    		} 
	    		else if (validate(object)) {
	    			System.out.println("L'objet " + object + " est valide, recuperation OK");
	    			unlocked.remove(object);
	    			locked.put(object, now);
	    			return object;
	    		} 
	    		else {
	    			// la validation a echoue
	    			System.out.println("L'objet " + object + " n'est pas valide");
	    			unlocked.remove(object);
	    			expire(object);
	    			object = null;
	    		}
	        }
	    }
	    // pas d'objet disponible, on en cree un nouveau
		System.out.println("Creation d'un objet");
	    object = create();
		System.out.println("Recuperation de l'objet cree " + object);
	    locked.put(object, now);
	    return (object);
	}

	/**
	 * On rend l'objet au pool
	 * @param t l'objet a rendre
	 */
	public synchronized void releaseObject(T t) {
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
	}
	
	/**
	 * log du pool d'objets
	 */
	public synchronized void logPool() {
    	System.out.println("************");
    	System.out.println("* UNLOCKED *");
    	System.out.println("************");
    	for (T object : unlocked.keySet()) {
    		System.out.println(object);
    	}
    	System.out.println("**********");
    	System.out.println("* LOCKED *");
    	System.out.println("**********");
    	for (T object : locked.keySet()) {
    		System.out.println(object);
    	}
	}
}
