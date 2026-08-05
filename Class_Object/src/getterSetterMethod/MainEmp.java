package getterSetterMethod;

public class MainEmp {
	public static void main(String[] args) {
		Manager m = new Manager(06, "Xyz", "It");
		System.out.println("Manager Id is :" + m.id);
		System.out.println("Manager name :" + m.name);
		System.out.println("manager Dept: " + m.dept);
	}

}
