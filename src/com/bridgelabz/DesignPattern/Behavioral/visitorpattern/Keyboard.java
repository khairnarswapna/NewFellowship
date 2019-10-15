package com.bridgelabz.DesignPattern.Behavioral.visitorpattern;

public class Keyboard implements ComputerPart 
{

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
