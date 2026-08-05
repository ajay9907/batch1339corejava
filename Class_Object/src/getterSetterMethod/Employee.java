package getterSetterMethod;
//Create an Employee class with:

//empId
//empName
//salary

//Use setters to assign values and getters to display them.
//Scanner Class.
public class Employee {
	private int empId;
	private String eName;
	private double salary;

	public Employee() {

	}

	public int geteID() {
		return empId;
	}

	public void seteID(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
