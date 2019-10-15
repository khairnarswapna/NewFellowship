/*Now we can create concrete User classes to be used by client system.*/

package com.bridgelabz.DesignPattern.Behavioral.meditorpattern;

public class UserImpl extends User 
{

	public UserImpl(ChatMediator med, String name) 
	{
		super(med, name);
	}

	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}

}