package com.bs;

public class ArtailSim implements Sim {
private String number;

public  ArtailSim(String  number)
{
this.number=number;	
}

public void call()
{
	System.out.println("call by :"+ number);
}

public void sms() {
	System.out.println("sms by :"+ number);
}

}
