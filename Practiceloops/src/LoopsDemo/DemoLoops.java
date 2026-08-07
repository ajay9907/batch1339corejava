package LoopsDemo;

public class DemoLoops {
	public static void main(String[] args) {

		// Using break Statement
//	for (int i = 1; i <= 10; i++) {
//		if (i == 5)
//			break;
//		System.out.println(i);
//
//	}

		System.out.println("------------");

		// Using continue Statement
//	for (int i = 1; i <= 10; i++) {
//		if (i == 5 || i == 1 || i == 2 || i == 3)
//			continue;
//		System.out.println(i);

		// For Loops

//		Syntax: 

//		for(initialization ;condition;updation++) {
//			//block of code
//			
//		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.err.println("--------------");
		// using while loop

//		Syntax:
//		initialization;
//		
//		while(condition;) {
//			Syso();
//			updation;
//		}
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}

		// Using nested while loop

//		int i = 1;
//		while (i <= 2) {
//			int j = 1;
//			while (j <= 3) {
//				System.out.println("i =" + i + " " + "j =" + j);
//				j++;
//			}
//			i++;
//
//		}

		// Using do -while loop -->It is using for execute atleast one time and after
		// checking condition.

//		Syntax: 

		// initalization;
//		do {
//			System.out.println();
//			updation;
//		}while();//condition
		
		int i = 1;
		do {
			System.out.println("Hello Ajay");
		} while (true);

	}

}
