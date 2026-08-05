//Write a program to check whether a person is eligible for loan:
//Age ≥ 21
//Salary ≥ 25,000
//CIBIL score ≥ 700

public class Loan {
	public static void main(String[] args) {

		int age = 21;
		double salary = 25000;
		int cibilscore = 70;

		if (age >= 21) {
			//System.out.println("You're Eligible");

			if (salary >= 25000) {
				//System.out.println("Youre Eligible");

				if (cibilscore >= 700) {
					System.out.println("Eligible");
				} else {
					System.out.println("Youre not eligible :(cibilscore is low)");
				}

			} else {
				System.out.println("Youre not eligible :(salary is low");

			}
		} else {
			System.out.println("Youre not eligible :(age is low");
		}
	}

}
