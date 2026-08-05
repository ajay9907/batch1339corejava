
//Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)
//2. Accept a number (1–12) from the user and print the name of the month using a switch case.
//3. Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.
//4. Take a grade character (A, B, C, D, F) as input and print a message:

public class SwitchCaseEx {

	public static void main(String[] args) {

		int day = 5;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("INVALID INPUT...!");

		}
		int num = 1;

		switch (num) {

		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");

		case 7:
			System.out.println("Jully");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;

		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;

		default:
			System.out.println("INVALID INPUT");

		}

		int a = 5, b = 7;
		char symbol = '+';

		switch (symbol) {
		case '+':
			System.out.println("Addition of " + "a+b-->" + (a + b));
			break;
		case '-':
			System.out.println("Substraction of" + (a - b));
			break;
		case 3:
			System.out.println("Multiplication of" + (a * b));
			break;
		case 4:

			System.out.println("division of" + (a / b));
			break;

		default:
			System.out.println("Invalid ....");
		}
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("INVALID INPUT...!");

		}

		// Q .Input color name (Red, Yellow, or Green) and print the appropriate action:

		String clr = "Green";
		switch (clr) {
		case "Red":
			System.out.println("STOP...!");
			break;
		case "Yellow":
			System.out.println("SLOW...!");
			break;

		case "Green":
			System.out.println("GO...!");
			break;

		default:
			System.out.println("INVALID PREDICT..!");
		}

	}

}
