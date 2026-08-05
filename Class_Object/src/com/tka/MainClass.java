package com.tka;

public class MainClass {

	public static void main(String[] args) {

		// Always Object Creation in main methods

		Laptop lp = new Laptop();
		lp.laptopdetails();
		System.out.println("Laptop Brand: " + (lp.lpt_Brnd = "Dell"));
		System.out.println("Laptop Color:" + (lp.lpt_Clr = "Black"));
		System.out.println("Laptop model:" + (lp.lpt_ModelYr = 2026));
		System.out.println("Laptop Name:" + (lp.lpt_Name = "Dell Ryzon"));
		System.out.println("Laptop Price is:" + (lp.lpt_Price = 50000));

		lp.m = new Mobile();// Using Refnce variable is--> m

		System.out.println(lp.m.hashCode());
		Mobile m = new Mobile();
		System.out.println(m.mob_Name = "Moto");

		System.out.println("------------------");
		Emp e = new Emp();
		e.empdetails();

		System.out.println(e.e_Id = 5);
		System.out.println(e.e_Name = "Motog85");
		System.out.println(e.e_Salary = 50000);

		System.out.println("-----------------");

		Car c = new Car();
		c.cardetails();
		System.out.println(c.car_Clr = "Red");
		System.out.println(c.car_Price = 45567654.77);
		System.out.println(c.model_Yr = 2024);
		System.out.println(c.car_Name = "Fortuner");
		System.out.println("---------------");

		Vehicle v = new Vehicle();
		v.display();
		System.out.println(v.hashCode());
	}

}
