package getterSetterMethod;

//Question 2 – Password Security
//Create a User class.
//Fields: username, password.
//Requirements: Username can be read and updated by any class. Password should never be
//returned to another class. Password can only be changed after validation. Task: Decide which
//getters/setters should be public, private, or protected

public class User {
	private String username;
	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUserName() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void changePassword(String oldPass, String newPass) {
		if (password.equals(oldPass)) {
			this.password = newPass;
			System.out.println("Password Changed Successfully.");
		} else {
			System.out.println("Invalid Old Passwod.");
		}
	}

}
