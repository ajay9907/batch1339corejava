package Interface;

public class CreditCard implements Payment {
	public void pay(double amount) {
		System.out.println("Pay through by Credit Card: " + amount);

	}
}
