package practiceofControlFlowStatement;

//Check whether a number is divisible by both 5 and 11.

public class Divisible {
	public static void main(String[] args) {

		int num = 55;
		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("Divisible by :" + num);

		} else {
			System.out.println("not divisible : " + num);
		}
	}
}
