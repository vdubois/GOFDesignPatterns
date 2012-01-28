package org.vdubois.designpatterns.structural.bridge;


/**
 * Classe de test du design pattern Pont
 * @author Vincent Dubois
 * @version 1.0
 */
public class PontMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final IShape[] shapes = 
			{ new CircleShape(1, 2, 3, new DrawingAPIOne()), new CircleShape(5, 7, 11, new DrawingAPITwo())};
		for (IShape shape : shapes) {
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}

}
