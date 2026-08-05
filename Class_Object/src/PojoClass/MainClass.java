package PojoClass;

public class MainClass {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.seteId(5);
		e.seteName("Ajay");
		e.setphNo(234567890l);

		System.out.println("Employee Id :" + e.geteId());
		System.out.println("Employee Name: " + e.geteName());
		System.out.println("Employee PhoneNo : " + e.getphNo());

		System.err.println("--------------");
	}
}
