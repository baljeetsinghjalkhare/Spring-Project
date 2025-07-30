package com.bs;

public class Mobile {
	//Mobile class is dependent on JioSim Class
//	private JioSim sim=new JioSim("1111111111");//tightly coupled  ->Dependency(we are taking just reference for holding dependency object)
	
	private Sim sim;// loosely Coupled -> Dependency Injection
	
	public void setSim(Sim sim)
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
	ArtailSim sim2=new ArtailSim("3333333333");
	IdeaSim sim3=new IdeaSim("4444444444");
	
	mobile.setSim(sim3);
	mobile.callButton();
	mobile.smsButton();
	
}
}
 