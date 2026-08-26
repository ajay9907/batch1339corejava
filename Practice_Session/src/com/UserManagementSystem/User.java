package com.UserManagementSystem;

public class User {

	private int uId;
	private String uName;
	private String address;
	private long mobNo;
	private long adarCard;
	private String panCard;
	private String email;

	public int getUId() {
		return uId;
	}

	public void setUId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return uName;
	}

	public void setName(String uName) {
		this.uName = uName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public long getAdarCard() {
		return adarCard;
	}

	public void setAdarCard(long adarCard) {
		this.adarCard = adarCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
