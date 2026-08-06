package OOP_Examples;

public class Admin1 extends ExamUser {

	int adminId;
	String adminName;

	public Admin1(int adminId, String adminName) {
		this.adminId = adminId;
		this.adminName = adminName;
	}

	public int getuId() {
		return adminId;
	}

	public void setuId(int uId) {
		this.adminId = uId;
	}

	public String getuName() {
		return adminName;
	}

	public void setuName(String uName) {
		this.adminName = uName;
	}

	@Override
	public void display() {
		System.out.println("User Id : " + getuId());
		System.out.println("User Name : " + getuName());
	}

	@Override
	public void resultCal() {
		System.err.println("---Student Result Report ---");

		System.out.println("Student Result Published Successfully.");

		System.out.println("All Students can View Result");

	}

}
