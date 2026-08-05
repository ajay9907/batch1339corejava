package com.saturdaypractice;

//6. Even or Odd
//Create class:
//Constructor â†’ number
//Method â†’ check even/odd

public class EvenOrOdd {

	int num;
	public EvenOrOdd(int num) {
		this.num=num;
			
		}public void check() {
			if(num%2==0)
			{
				System.out.println("Even number:"+num);
				
			}else {
				System.out.println("Odd Number: "+num);
			}
		}
		
	}

