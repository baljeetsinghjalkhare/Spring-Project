package com.bs;

public class JioSim {
	private String number;
	
	public JioSim(String number)
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
