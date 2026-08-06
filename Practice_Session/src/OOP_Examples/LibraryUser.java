package OOP_Examples;

public abstract class LibraryUser implements IssueBook {
	private int userId;
	private String userName;

	public LibraryUser(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void display() {
		System.out.println("User Id is :" + getUserId());
		System.out.println("UserName is :" + getUserName());
	}

	public abstract void calcFine();

}
