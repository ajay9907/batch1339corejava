package getterSetterMethod;

public class Manager extends CompanyEmployee {

	public Manager(int id, String name, String dept) {
		super(id, name, dept);

	}

	public void updateDept(String dept) {
		this.dept = dept;
	}
}
