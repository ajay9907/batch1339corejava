package getterSetterMethod;

public class MainPatient {
	public static void main(String[] args) {

		Patient p = new Patient();
		p.setPatientId(67);
		System.out.println("Patient Id : " + p.getPatientId());

		p.setPname("xyz");
		System.out.println("Patient name: " + p.getPname());
	}

}
