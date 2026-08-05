 //Take a number and check if it is positive, negative, or zero.

import java.util.*;

public class ScannerPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
	int num=sc.nextInt();
	
	if(num>0)
	{
		System.out.println("Positive"+" "+num);
	}else if(num<0)
	{
		System.out.println("Negative"+" "+num);
	}else {
		System.out.println("Zero");
	}

	}

}
