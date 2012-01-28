package org.vdubois.designpatterns.structural.bridge;


/**
 * Interface de l'implementation
 * @author Vincent Dubois
 * @version 1.0
 */
public interface IDrawingAPI {

	/**
	 * methode de dessin d'un cercle
	 * @param x abscisse
	 * @param y ordonnee
	 * @param radius rayon
	 */
	public void drawCircle(double x, double y, double radius);
}
