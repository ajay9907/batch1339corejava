package PojoClass;

public class Employee {
	// using fields as a private
	private int eId;
	private String name;
	private long phNo;

//using default constructor.
	public Employee() {
	}

	// using parameterized constructor.
	public Employee(int eId, String name, long phNo) {
		this.eId = eId;
		this.name = name;
		this.phNo = phNo;
	}

	// using getter method.
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return name;
	}

	public void seteName(String name) {
		this.name = name;
	}

	public long getphNo() {
		return phNo;
	}

	public void setphNo(long phNo) {
		this.phNo = phNo;
	}

}