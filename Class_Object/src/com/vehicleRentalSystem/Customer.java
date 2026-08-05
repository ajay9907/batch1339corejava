package com.vehicleRentalSystem;

public class Customer {
	private int cID;
	private String cName;
	private long phoneNumber;
	private int license;

	public Customer(int cID, String cName, long phoneNumber, int license) {
		this.cID = cID;
		this.cName = cName;
		this.phoneNumber = phoneNumber;
		this.license = license;

	}

	public int getCustomerID() {
		return cID;

	}

	public void setCustomerID(int cID) {
		this.cID = cID;
	}

	public String getName() {
		return cName;
	}

	public void setName(String cName) {
		this.cName = cName;
	}

	public long getMobileNo() {
		return phoneNumber;
	}

	public void setMobileNo(long mNumber) {
		this.phoneNumber = mNumber;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public void display() {

		System.out.println("Customer Id: " + cID);
		System.out.println("Customer Name : " + cName);
		System.out.println("Customer Phone No : " + phoneNumber);
		System.out.println("Customer Licence No : " + license);

	}

}
