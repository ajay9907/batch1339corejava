package scenerioPracticeQuestions;
//• 4. Login System – Username=admin, Password=1234.

public class LoginSystem {

	public void login(String username, String password) {
		String username1 = "admin";
		String password1 = "1234";

		if (username == ("admin") && password == ("1234")) {
			System.out.println("Login Successfully.");
		} else {
			System.out.println("Invalid Credentials.");
		}
	}

	public static void main(String[] args) {
		LoginSystem ls = new LoginSystem();
		ls.login("admin", "1234");

	}
}
