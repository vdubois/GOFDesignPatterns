package org.vdubois.designpatterns.creational.objectpool;


/**
 * Classe de test du design pattern Object Pool
 * @author Vincent Dubois
 * @version 1.0
 */
public class ObjectPoolMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ObjectPool<Connection> connectionPool = new ConnectionPool();
		
		Connection connection = connectionPool.aquireObject();
		connectionPool.logPool();
		connection = connectionPool.aquireObject();
		connectionPool.logPool();
		connection.open();
		connection.operation();
		connection = connectionPool.aquireObject();
		connectionPool.logPool();
		connection.open();
		connectionPool.releaseObject(connection);
		connectionPool.logPool();
		connection = connectionPool.aquireObject();
		connectionPool.logPool();
		connection.open();
		connection.operation();
		connection.close();
		connectionPool.releaseObject(connection);
		connectionPool.logPool();
		connection = connectionPool.aquireObject();		
		connectionPool.logPool();
	}

}
