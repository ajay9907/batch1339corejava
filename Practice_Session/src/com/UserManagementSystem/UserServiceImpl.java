package com.UserManagementSystem;

import java.util.Scanner;

public class UserServiceImpl implements UserService {

	Scanner sc = new Scanner(System.in);

	int ch = sc.nextInt();

	@Override
	public void createUser() {
		switch (ch) {

		case 1:
			createUser();
			break;
		case 2:
			displayUserInfo();
			break;
		case 3:
			updateUserInfo();
			break;
		case 4:
			deleteUserInfo();

		}
		System.out.println("How many Create Users :");

	}

	@Override
	public void displayUserInfo() {

	}

	@Override
	public void updateUserInfo() {

	}

	@Override
	public void deleteUserInfo() {

	}

}
