package org.vdubois.designpatterns.structural.bridge;


/**
 * Interface de l'abstraction
 * @author Vincent Dubois
 * @version 1.0
 */
public interface IShape {

	/**
	 * dessin
	 */
	public void draw();
	
	/**
	 * redimension en pourcentage
	 * @param pct le pourcentage
	 */
	public void resizeByPercentage(double pct);
}
