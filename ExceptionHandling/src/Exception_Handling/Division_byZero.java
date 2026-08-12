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
			System.out.println("Cannot Divison by zero");
		} catch (NumberFormatException e1) {
			System.out.println("Invalid Number Format ");

		} finally {
			System.out.println("always finally block executes. ");
		}
	}
}
