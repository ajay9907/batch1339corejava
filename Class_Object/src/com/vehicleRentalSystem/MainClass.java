package com.vehicleRentalSystem;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("!!-----Vehicle Rental System-----!!");

		System.out.println("1. Add Car");
		System.out.println("2. Add Bike");
		System.out.println("3. Add Customer");
		System.out.println("4. Search Vehicle");
		System.out.println("5.Rent Vehicle ");
		System.out.println("6.Return Vehicle ");
		System.out.println("7.Display All Vehicles");
		System.out.println("8. Display Customers");
		System.out.println("9.Display Rentals");
		System.out.println("10.EXIT");

		System.err.println("----------------------------------");

		System.out.print("Enter Your Choice :");
		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:

			System.out.println("Add Car ");

			System.out.print("Enter Vehicle Id:");
			String vid = sc.nextLine();
//			sc.nextLine();

			System.out.print("Enter Brand :");
			String vbrand = sc.nextLine();

			System.out.print("Enter Model:");
			String vModel = sc.nextLine();

			System.out.print("Enter Rent Per Day :");
			int rentDay = sc.nextInt();

			System.out.print("Is Available (true/false):");
			boolean available = sc.nextBoolean();
			sc.nextLine();

			System.out.print("Enter Number of Seats:");
			int seats = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Fuel Type:");
			String fuel = sc.nextLine();

			Car c = new Car(vid, vbrand, vModel, rentDay, available, seats, fuel);

			System.err.println("Car Added Successfully.");

			System.out.println("------------------");

			c.display();
			c.calculateRent(7);

			break;

		case 2:
			System.out.println("Add Bike");
			sc.nextLine();

			System.out.print("Enter Vehicle Id:");
			String vid1 = sc.nextLine();

			System.out.print("Enter Brand :");
			String vbrand1 = sc.nextLine();

			System.out.print("Enter Model:");
			String vModel1 = sc.nextLine();

			System.out.print("Enter Rent Per Day :");
			int rentDay1 = sc.nextInt();

			System.out.print("Is Available (true/false):");
			boolean available1 = sc.nextBoolean();
			sc.nextLine();

			System.out.print("Enter Number of Seats:");
			int seats1 = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Fuel Type:");
			String fuel1 = sc.nextLine();

			System.out.println("Bike Engine CC:");
			int eng = sc.nextInt();
			sc.nextLine();

			System.out.println("Bike Type :");
			String bikeType = sc.nextLine();

			System.out.println("Helmet Included (true/false):");
			boolean helmet = sc.nextBoolean();

			System.err.println("================");

			Bike b = new Bike(vid1, vbrand1, vModel1, rentDay1, available1, seats1, fuel1, eng, helmet, bikeType);
			b.display();
			System.err.println("Bike Added Successfully.");

			break;

		case 3:
			System.out.println(" Add Customer");
			sc.nextLine();
			System.out.print("Cutomer Id :");
			int cid = sc.nextInt();
			sc.nextLine();

			System.out.print("Customer Name :");
			String name = sc.nextLine();

			System.out.print("Phone Number :");
			long phone = sc.nextLong();

			System.out.print("License Number : ");
			int licenNo = sc.nextInt();

			System.err.println("=============================");
			Customer c1 = new Customer(cid, name, phone, licenNo);
			c1.display();

			System.err.println("CUSTOMER ADDED SUCCESSFULLY.");

			break;

		case 4:
			System.out.println("Search Vehicle ");
			sc.nextLine();
			System.out.println("Enter Vehicle Id : ");
			String vehicleId = sc.nextLine();

			break;
		case 5:

		case 6:
			System.out.println("Return Vehicle ");
			String vreturn = sc.nextLine();
			break;
		case 7:
			System.out.println("Display All Vehicles");
			break;
		case 8:
			System.out.println(" Display Customers");
			break;
		case 9:
			System.out.println("Display Rentals");
			break;
		case 10:
			System.out.println("EXIT");
			System.out.println("Thank You For Using ");
			break;
		default:
			System.out.println("INVALID INPUT.");
		}

	}
}
