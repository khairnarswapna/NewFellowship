package com.bridgelabz.DesignPattern.Behavioral.meditorpattern;

public interface ChatMediator 
{

	public void sendMessage(String msg, User user);

	void addUser(User user);
		
}
