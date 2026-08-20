package scenerioPracticeQuestions;

public class MainBank {
	public static void main(String[] args) {

		Account ac = new SavingsAccount();
		ac.setAccountNo(4567845678l);
		ac.setBalance(50000);

		System.out.println("You're Account No is :" + ac.getAccountNo());
		System.out.println("Youre Bank Balance is :" + ac.getBalance());

		ac.interest(12);

		System.err.println("----------------");

		PremiumSavingsAccount p = new PremiumSavingsAccount();
		p.addFeature();
		p.highLimit();
	}

}
