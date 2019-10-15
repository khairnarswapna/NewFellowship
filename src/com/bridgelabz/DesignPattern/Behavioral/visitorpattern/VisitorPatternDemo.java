/**
 * purpose:Implementation of visitor Design Pattern
 * @author :swapna khairnar
 * 
 */
package com.bridgelabz.DesignPattern.Behavioral.visitorpattern;
public class VisitorPatternDemo {

	public static void main(String[] args) {

	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());

	}

}
