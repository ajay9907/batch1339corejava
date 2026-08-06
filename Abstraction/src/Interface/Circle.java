package Interface;

public class Circle implements Shape {
	double rad = 5;

	@Override
	public void area() {
		double area;
		area = Math.PI * rad * rad;
		System.out.println("Area Of Circle =" + area);
	}

	@Override
	public void perimeter() {
		double parimeter = 2 * Math.PI * rad;
		System.out.println("Perimeter of Circle=" + parimeter);
	}

}
