package Interface;

public class SimpleCalculator implements Calculator {
	@Override
	public void add(int a, int b) {
		System.out.println("Addition of Two value :" + (a + b));
	}

	@Override
	public void substract(int a, int b) {
		System.out.println("Substraction :" + (a - b));

	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Multiplication :" + (a * b));
	}

	public void divide(int a, int b) {
		System.out.println("Division :" + (a / b));

	}
}
