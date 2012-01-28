package org.vdubois.designpatterns.structural.bridge;


/**
 * Implementation concrete
 * @author Vincent Dubois
 * @version 1.0
 */
public class DrawingAPIOne implements IDrawingAPI {

	/** 
	 * @see org.vdubois.designpatterns.structural.bridge.IDrawingAPI#drawCircle(double, double, double)
	 */
	public void drawCircle(double x, double y, double radius) {
		System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
	}
}
