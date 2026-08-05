package com.tka;

public class Liabrarymainclass {
	public static void main(String[] args) {
		Library lb = new Library();
		
		lb.accept("abc", 3, "xyz", 4, 5, "stu");
		lb.display();
		
		Student s=new Student();
		s.showdetails();
		
		Vehicle v=new Vehicle();
		v.display();
		
		Employee e=new Employee();
		e.accept(5, "wrs", "yfss", 2);
		e.annualSalary();
		e.display();		
//
		Hospital h=new Hospital();
		h.main(args);
	}

}
