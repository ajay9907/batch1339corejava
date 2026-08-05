//Write a program to build a menu-driven ATM system using switch:
//1 → Check Balance
//2 → Deposit
//3 → Withdraw
//4 → Exit
//(Use if-else inside switch for validation like insufficient balance)

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Atm {
	public static void main(String[] args) {
		
		int ch=1;
		int balance=5000;
		 int withdraw=2000;
		
		switch(balance)
		{
		case 1:
			System.out.println("Check Balance"+balance);
			break;
		case 2:
			System.out.println("Deposite" +balance);
			break;
		case 3:
			if(balance<=withdraw)
			{
				System.out.println("insufficient balance:");
			}else
			{
				System.out.println("Insufficient balance");
			}
			default:
				System.out.println("Exit");
			
		}
	
}

}
