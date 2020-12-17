package Lec4;

abstract class Shape{
	abstract double calculateArea();
}

class Rectangle extends Shape{
	
	public static final double LENGTH = 20.0;
	public static final double WIDTH = 10.0;

	@Override
	double calculateArea() {
		return LENGTH * WIDTH;
	}
	
}

class Circle extends Shape{
	
	public static final double RADIUS = 100.0;

	@Override
	double calculateArea() {
		return Math.PI * RADIUS * RADIUS;
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		
		System.out.println("Rectangle Area : " + rectangle.calculateArea());
		System.out.println("Circle Area : " + circle.calculateArea());

	}

}
