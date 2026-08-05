package Interface;

public class Rectangle implements Shape {
	double length = 5;
	double width = 6;

	public void area() {
		double areaRect;
		areaRect = length * width;
		System.out.println("Area Of Rectangle =" + areaRect);
	}

	public void perimeter() {
		double par;
		par = 2 * length * width;
		System.out.println("Perimeter of Rectangle =" + par);
	}

}
