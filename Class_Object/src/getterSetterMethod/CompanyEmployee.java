package getterSetterMethod;
//Question 7 – Company Employee

//Create two classes: Employee and Manager extends Employee.
//Requirements: Only subclasses should be able to update the employee's department. Every class
//should be able to read the department. Hint: Think about protected

public class CompanyEmployee {
	int id;
	String name;
	protected String dept;

	public CompanyEmployee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
}
