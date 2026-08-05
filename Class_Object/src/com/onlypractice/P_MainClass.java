package com.onlypractice;

public class P_MainClass {
	public static void main(String[] args) {

		P_Student s = new P_Student();
		s.display();
		System.out.println("Student Marks:" + (s.marks = 78));
		System.out.println("Student Name is:" + (s.name = "Ajay"));
		System.out.println("Student roll no:" + (s.roll_No = 5));

		System.out.println("-------------");

		P_Student ps = new P_Student();
		System.out.println("Student Marks:" + (ps.marks = 66));
		System.out.println("Student Name is:" + (ps.name = "Vijay"));
		System.out.println("Student roll no:" + (ps.roll_No = 55));

		System.out.println("-------------");

		P_Emp e = new P_Emp();
		e.showdetails();
		System.out.println("Employee Name:" + (e.e_Name = "Xyz"));
		System.out.println("Employee Name:" + (e.e_Salary = 45000));

		System.out.println("-------------");

		P_Car c = new P_Car();
		c.showcar();
		System.out.println("Car Brand:" + (c.c_Brnd = "Toyota"));
		System.out.println("Car Model :" + (c.c_ModlYr = 2016));
		System.out.println("Car Price:" + (c.c_Price = 345678.780));

		System.out.println("---------------------");

		P_Car c1 = new P_Car();
		c1.showcar();
		System.out.println("Car Brand:" + (c1.c_Brnd = "TATA"));
		System.out.println("Car Model :" + (c1.c_ModlYr = 2018));
		System.out.println("Car Price:" + (c1.c_Price = 345655.780));

		System.out.println("-----------------------------------");

		P_Mobile m = new P_Mobile();
		m.displayspec();
		System.out.println(m.m_Brnd = "Motorola");
		System.out.println(m.m_Ram = "12gb");
		System.out.println(m.price = 55000);

		System.out.println("------------------------");

		P_Rectangle r = new P_Rectangle();

		System.out.println(r.length = 5);
		System.out.println(r.width = 6);
		r.calculatearea();

		System.out.println("-------------------");

		P_Radius rad = new P_Radius();
		System.out.println(rad.radius = 5);
		rad.areaofcircle();

		System.out.println("-------------------------");

		P_BankAccount ba = new P_BankAccount();
		System.out.println("Account Balance is:" + (ba.acBlnce = 45000));
		System.out.println("Bank Account No:" + (ba.acNo = 87654321654l));
		ba.displaybalance();

		System.out.println("----------------------");
		P_Book b = new P_Book();
		System.out.println("Book Title is:" + (b.title = "THE END IS BEGINNING"));
		System.out.println("Book Author:" + (b.author = "AjayAgwan"));
		System.out.println("Book price" + (b.price = 200));
		b.showBook();
		
		System.out.println("-------------------------");
		
		P_Atm a=new P_Atm();
		System.out.println(a.bal=50000);
		System.out.println(a.curbal=46000);
		a.checkBalance();

	}

}
