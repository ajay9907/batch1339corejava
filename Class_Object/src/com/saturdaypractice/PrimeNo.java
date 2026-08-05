package com.saturdaypractice;
//19. Prime Number Check
//Create class:
//Constructor â†’ number
//Method â†’ check prime

public class PrimeNo {
	
	int num;
	public PrimeNo(int num) {
		this.num=num;
	}
	public void checkPrime() {
		int num=2, count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime no ");
		} else {
			System.out.println("not prime");
		}
		
		
		
	}
		}
	


