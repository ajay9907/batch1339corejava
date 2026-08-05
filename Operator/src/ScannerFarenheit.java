//Take temperature in Celsius and convert to Fahrenheit.

import java.util.*;

public class ScannerFarenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value:");
		double celcius = sc.nextDouble();

		double fern = (celcius * 9 / 5) + 32;
		System.out.println("Ferenhit:" + fern);

	}

}
