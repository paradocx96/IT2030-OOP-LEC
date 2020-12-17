package Lec4;

abstract class Ancester {
	abstract void method();
}

abstract class Parent extends Ancester {
	void method2() {
		System.out.println("Parent");
	}
}

class Child extends Parent {

	@Override
	void method() {
		System.out.println("Child");
	}
	
}

public class Ex2 {

	public static void main(String[] args) {
		Ancester child = new Child();
		child.method();
	}

}
