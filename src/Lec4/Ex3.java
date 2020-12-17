package Lec4;

interface IShape {

	double LENGTH = 20.0; // public final by default
	double WIDTH = 10.0; // public final by default
	double RADIUS = 100.0; // public final by default

	double calculateArea(); // public abstract by default

	void display(); // public abstract by default
}

class Rectangle1 implements IShape {

	@Override
	public double calculateArea() {
		return LENGTH * WIDTH;
	}

	@Override
	public void display() {
		System.out.println("Rctangle Shape");
	}

}

class Circle1 implements IShape {

	@Override
	public double calculateArea() {
		return Math.PI * RADIUS * RADIUS;
	}

	@Override
	public void display() {
		System.out.println("Circle Shape");
	}

}

public class Ex3 {

	public static void main(String[] args) {

		IShape rectangle = new Rectangle1();
		IShape circle = new Circle1();

		System.out.println("Rectangle Area : " + rectangle.calculateArea());
		System.out.println("Circle Area : " + circle.calculateArea());

		rectangle.display();
		circle.display();

	}

}
