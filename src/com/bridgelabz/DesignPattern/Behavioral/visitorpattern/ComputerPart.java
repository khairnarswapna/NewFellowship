package com.bridgelabz.DesignPattern.Behavioral.visitorpattern;

public interface ComputerPart 
{
	   public void accept(ComputerPartVisitor computerPartVisitor);
}