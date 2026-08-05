package getterSetterMethod;

public class MainBank1 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setAccno(456789067890l);
		System.out.println("Bank Account number is :" + ba.getAccno());
		ba.deposit(1000);
		System.out.println("Your Bank balance :" + ba.getBal());
		ba.withdraw(500);
	}

}
