package com.polymorphism;

public class MainClass {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(5, 6);
		c.add(7, 5, 8);

		System.err.println("**********************");

		Multiplication mul = new Multiplication();
		mul.multiply(5, 4);
		mul.multiply(6.7, 9.0);

		System.err.println("**********************");

		Area_Circle_Rectangle acr = new Area_Circle_Rectangle();
		acr.areaCal(55);
		System.out.println(acr.areaCal(6, 4));

		System.err.println("**********************");
		PrintValue pv = new PrintValue();
		pv.display(555);
		pv.display("Ajay");

		System.err.println("**********************");
		Sum s = new Sum();
		s.sum(5, 1);
		s.sum(55.7f, 80.67f);

		System.err.println("**********************");
		Demo d = new Demo();
		d.show(5, "A");
		d.show("A", 5);

		System.err.println("**********************");

		Student stud = new Student();
		System.out.println("Student id : " + stud.id + " name " + stud.name);

		Student stud1 = new Student(3, "Ajay");

		System.out.println(" First Student Id : " + (stud1.id = 5) + " name: " + stud1.name);

		Student stud2 = new Student(5, "Xyz");
		System.out.println("Second Student Id :" + (stud2.id = 6) + " name :" + stud2.name);

		System.err.println("**********************");
		StaticMethodPrint smp = new StaticMethodPrint();
		smp.print(5);
		smp.print(55, 66);

		System.err.println("**********************");

		MainMethodOverload mo = new MainMethodOverload();
		mo.main(0);
		mo.main(args);

		System.err.println("**********************");
		Numbers n = new Numbers();
		n.calculate(5);
		n.calculate(4);

		System.err.println("**********************");
		FindMaxNo mn = new FindMaxNo();
		mn.max(44, 60);
		mn.max(55, 45, 79);

		System.err.println("**********************");
		Name_Age na = new Name_Age();
		na.details("ssssss");
		na.details("A", 4);

		System.err.println("**********************");
		ConvertTemp ct = new ConvertTemp();
		ct.convert(5);
		ct.convert(12);

		System.err.println("**********************");
		ReturnType rt = new ReturnType();
		System.out.println(rt.display1());
		System.out.println(rt.display(5));

	}
}
