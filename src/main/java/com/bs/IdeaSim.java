package com.bs;

public class IdeaSim implements Sim {
private String number;
	
	public IdeaSim(String number)
	{
		this.number=number;
	}

	public void call()
	{
		System.out.println("call by jio sim :"+ number);
	}
	public void sms()
	{
		System.out.println("sms by jio sim :"+number);
	}
}
