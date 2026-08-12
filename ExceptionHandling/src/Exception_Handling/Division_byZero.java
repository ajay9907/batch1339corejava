package Exception_Handling;

//Handle Division by Zero
//
//Write a program to divide two numbers and handle ArithmeticException using try-catch
public class Division_byZero {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int c = a / b;
			System.out.println(" Calculate Division of : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Not Divison by zero");
		} finally {
			System.out.println("always finally block executes. ");
		}
	}
}
