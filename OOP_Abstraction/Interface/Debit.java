package Interface;

public class Debit implements Payment {

	public void pay(double amount) {

		System.out.println("Pay through by debit card: " + amount);
	}
}
