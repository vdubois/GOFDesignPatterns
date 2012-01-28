package org.vdubois.designpatterns.behavioral.interpreter;

/**
 * Classe de test du design pattern interpreteur
 * @author Vincent Dubois
 * @version 1.0
 */
public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExpressionNonTerminale racine = new ExpressionNonTerminale("RACINE");
		ExpressionNonTerminale element1 = new ExpressionNonTerminale("ELEMENT1");
		ExpressionNonTerminale element2 = new ExpressionNonTerminale("ELEMENT2");
		ExpressionNonTerminale element3 = new ExpressionNonTerminale("ELEMENT3");
		
		Expression expressionTexte1 = new ExpressionTerminale("TEXTE1");
		Expression expressionTexte2 = new ExpressionTerminale("TEXTE2");
		
		racine.ajouterExpression(element1);
		racine.ajouterExpression(element2);
		element2.ajouterExpression(element3);
		element1.ajouterExpression(expressionTexte1);
		element3.ajouterExpression(expressionTexte2);
		
		racine.operation();
	}
}
