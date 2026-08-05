// Take radius from user and calculate area of circle.

import java.util.Scanner;

public class RadiusAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The radius of circle :");
		double radius = sc.nextDouble();
		
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is :"+area);
		

	}

}
