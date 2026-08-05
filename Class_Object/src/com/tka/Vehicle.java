package com.tka;

public class Vehicle {
	String vname = "Tata1111";
	String vno = "MH 12 FS 4567";
	double vprice = 2578900;
	int vmodel = 2025;
	int vavg = 50;

	
	public void display()
	{
		System.err.println("Vehicles Information ....");
		System.out.println("Vehicle name:"+vname);
		System.out.println("Vehicle no :"+vno);
		System.out.println("Vehicle Price:"+vprice);
		System.out.println("Vehicle model:"+vmodel);
		System.out.println("Vehicle Avg:"+vavg);
	}
	
}
