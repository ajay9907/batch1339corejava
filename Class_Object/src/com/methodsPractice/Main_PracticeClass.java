package com.methodsPractice;

public class Main_PracticeClass {

	public static void main(String[] args) {

		Square_No sq = new Square_No();
		sq.Sqauare(5);

		sq.Square();// Non-Parameterized method without return type

		System.out.println("Square of number: " + sq.square_No1(9));// Parameterized method
		System.out.println(sq.square_No2());

		// Object creation of 2nd class
		System.out.println("------------------------------");
		CubeOfNumbers cn = new CubeOfNumbers();
		System.out.println("No of Cube :" + cn.cube_No(5));

		cn.cube_No1();
		System.out.println("No of Cube: " + cn.cube_No2(7));

		cn.cube_No3();

		System.out.println("---------------------------------");
//Object Creation of 3rd class...
		// Whenever we have using Parameter with return type method then using Syso
		// method and print output

		SumOfTwoNo st = new SumOfTwoNo();
		System.out.println("Sum of two numbers :" + st.sum1(8, 5));

		st.sum2();

		st.sum3(4, 6);

		st.sum4();

		System.out.println("-------------------------");

		// Object Creation of 4th class...

		Greatest_No gn = new Greatest_No();
		gn.greatest_No(7500, 700, 6);

		System.out.println("Greatest number is : " + gn.greatest_No1(6, 7, 9));

		System.out.println("Greatest no is : " + gn.greatest_NO2());
		gn.greatest_NO3();

		System.out.println("--------------------------");
		// Object Creation of 5th class...

		EvenOrOdd eo = new EvenOrOdd();
		System.out.println("Even No:" + eo.even_Odd(3));
		eo.even_Odd1();
		System.out.println("Even no: " + eo.even_Odd2());

		eo.even_Odd3();

		System.out.println("--------------------------");
		StrengthChecker sc = new StrengthChecker();
		System.out.println(sc.checkPass("Ajay@5556"));

		System.out.println("--------------------------");

		Library l1 = new Library();
		l1.issueBook("Monster", true);

		System.out.println("--------------------------");

		Shopping s = new Shopping();
		s.calculateTotal(200, 100, 300);

		System.out.println("--------------------------");
		MaxNumber mn = new MaxNumber();
		System.out.println("Max number is :" + mn.max(0, 566, 10));

		System.out.println("--------------------------");

		Primeno pn = new Primeno();
		System.out.println("Is Prime no: " + pn.checkPrime(3));

		System.out.println("--------------------------");
		PalindromeNo pal = new PalindromeNo();
		System.out.println("Palindrome number:" + pal.isPalindrome(45566));

		System.out.println("---------------------");

		EvenOdd eo1 = new EvenOdd();
		System.out.println(eo.even_Odd2());

		System.out.println("---------------------");
		Grade grade = new Grade();
		System.out.println(grade.getGrade(70));
	}
}
