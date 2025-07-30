package com.bs;

public class Mobile {
	//Mobile class is dependent on JioSim Class
//	private JioSim sim=new JioSim("1111111111");//tightly coupled  ->Dependency(we are taking just reference for holding dependency object)
	
	private JioSim sim;// loosely Coupled -> Dependency Injection
	
	public void setSim(JioSim sim)
	{
		this.sim=sim;
	}
	
	public void callButton()
	{
	sim.call();	
	}
	
	public void smsButton() 
	{
	sim.sms();	
	}
public static void main(String ar[])
{
	Mobile mobile=new Mobile();
	JioSim sim1=new JioSim("2222222222");
	JioSim sim2=new JioSim("3333333333");
	JioSim sim3=new JioSim("4444444444");
	JioSim sim4=new JioSim("55555555");
	
	mobile.setSim(sim4);
	mobile.callButton();
	mobile.smsButton();
	
}
}
 