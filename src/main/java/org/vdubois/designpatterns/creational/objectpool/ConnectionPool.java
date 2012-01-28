package org.vdubois.designpatterns.creational.objectpool;


/**
 * Pool d'objets Connection
 * @author Vincent Dubois
 * @version 1.0
 */
public class ConnectionPool extends ObjectPool<Connection> {

	/**
	 * @see org.vdubois.designpatterns.creational.objectpool.ObjectPool#create()
	 */
	protected Connection create() {
		return new Connection();
	}

	/**
	 * @see org.vdubois.designpatterns.creational.objectpool.ObjectPool#expire(java.lang.Object)
	 */
	public void expire(Connection o) {
		if (!o.isClosed()) {
			o.close();
		}
	}

	/**
	 * @see org.vdubois.designpatterns.creational.objectpool.ObjectPool#validate(java.lang.Object)
	 */
	public boolean validate(Connection o) {
		return o != null && o.isClosed();
	}

}
