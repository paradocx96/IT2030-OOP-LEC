package Lec4B;

class MathOp {// Calee Method

	public int add(int a, int b) {
		return a + b;
	}

	public double divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}

public class Ex5 {

	public static void main(String[] args) { // Caller Method

		MathOp math = new MathOp();
		System.out.println(math.add(2, 0));		
		
		try {
			System.out.println(math.divide(2, 0));
		} catch (ArithmeticException e) {

			System.out.println("Error : " + e);
		}
	}
}
