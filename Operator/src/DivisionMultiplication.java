
// Take two numbers and print multiplication & division.
import java.util.*;

public class DivisionMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("Enter number 1");
		a = sc.nextInt();

		System.out.println("Enter number 2");
		b = sc.nextInt();

		int multiplication = a * b;
		int division = a / b;

		System.out.println("Multiplication of number:" + multiplication);
		System.out.println("--------------");
		System.out.println("Division of number:" + division);

	}

}
