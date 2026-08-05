
//Take three numbers and print the largest number.

import java.util.*;

public class PracticeScannerPrintLargestno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  First number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter Second number:");
		int num2 = sc.nextInt();

		System.out.println("Enter third number:");
		int num3 = sc.nextInt();
		
		if(num1>=num2&&num2<=num1)
		{
			System.out.println("Largest number:"+num1);
		}else if(num2>=num3&&num2<=num3)
		{
			System.out.println("Largest number:"+num2);
		}else 
		{
			System.out.println("largest number "+num3);
		}
	}
}