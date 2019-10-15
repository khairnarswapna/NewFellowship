/**
 * purpose:Implementation of Facade Pattern
 * @author :swapna khairnar
 * 
 */
package com.bridgelabz.DesignPattern.structural.facade;

public class FacadePatternDemo 
{

	public static void main(String[] args) {
		 ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();	
	}

}
