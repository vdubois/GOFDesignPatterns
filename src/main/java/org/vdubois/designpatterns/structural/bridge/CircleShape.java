package org.vdubois.designpatterns.structural.bridge;


/**
 * Implementation de l'abstraction
 * @author Vincent Dubois
 * @version 1.0
 */
public class CircleShape implements IShape {

	/** abscisse */
	private double x;
	
	/** ordonnee */
	private double y;
	
	/** rayon */
	private double radius;
	
	/** implementation de dessin */
	private IDrawingAPI drawingAPI;	
	
	/**
	 * Constructeur
	 * @param x
	 * @param y
	 * @param radius
	 * @param drawingAPI
	 */
	public CircleShape(double x, double y, double radius, IDrawingAPI drawingAPI) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawingAPI = drawingAPI;
	}

	/** 
	 * @see org.vdubois.designpatterns.structural.bridge.IShape#draw()
	 */
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

	/** 
	 * @see org.vdubois.designpatterns.structural.bridge.IShape#resizeByPercentage(double)
	 */
	public void resizeByPercentage(double pct) {
		radius *= pct;
	}

}
