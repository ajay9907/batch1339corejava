//Write a program to find the greater number between two numbers.

public class FindTwoNum {
	public static void main(String[] args) {
		int a = 100;
		int b = 90;

		if (a >= b) {
			System.out.println(a+"is greater");
		} else if (b < a) {
			System.out.println(b+"is less");
		} else {
			System.out.println("Both numbers are same");
		}

	}
}
