package com.methodsPractice;
//Online Voting System
//Method vote(int age) → allow only if age ≥ 18.

public class Voting {
	
	public void vote(int age) {
		if(age>=18)
		{
			System.out.println("U re Eligible...");
		}else {
			System.out.println("not Eligible ...");
		}
	}

}
