package Interface;

import javax.sound.midi.SysexMessage;

public class MainClass {
	public static void main(String[] args) {
//		SimpleCalculator c; // Reference variable
//		c = new SimpleCalculator();// Assigning memory
//		c.add(5, 6);
//		c.divide(5, 5);
//		c.substract(10, 12);
//		c.multiply(5, 8);
//
//		System.err.println("-------------------");
//
//		Shape s;
//		s = new Circle();
//		s.area();
//		s.perimeter();
//		s = new Rectangle();
//		s.area();
//		s.perimeter();

		System.err.println("-------------------");
		Vehicle v;
		v = new Car();
		v.start();
		v.stop();

		v = new Bike();
		v.start();
		v.stop();

		System.err.println("-------------------");
		Employee e;
		e = new FullTimeEmployee();
		e.calculateSalary();

		e = new PartTimeEmployee();
		e.calculateSalary();

		System.err.println("-------------------");
		Payment p;
		p = new UPI();
		p.pay(1000);

		p = new CreditCard();
		p.pay(2000);

		p = new Debit();
		p.pay(500);

		System.err.println("-------------------");

		Bank b;
		b = new SBI();
		b.deposit();
		b.withdraw();
		b.checkBal();

		System.out.println("------------------");

		b = new HDFC();
		b.deposit();
		b.withdraw();
		b.checkBal();

		System.err.println("-------------------");
		SendMessage sm;
		sm = new Application();
		sm.emailNotification("Hello Ajay.");
		sm.smsNotification("Your  remaining data is 500 mb ");
		sm.whatsAppNotification("Good Morning");

		System.err.println("-------------------");

		RemoteControl rc;
		rc = new TV();
		rc.powerON();
		rc.powerOff();

		System.out.println("--------------");
		rc = new AC();
		rc.powerOff();
		rc.powerON();
	}

}
