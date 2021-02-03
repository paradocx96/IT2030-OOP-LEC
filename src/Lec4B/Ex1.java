package Lec4B;

public class Ex1 {

	public static void main(String[] args) {

		int d, b;
		try { // monitor a block of code.

			d = 0;
			b = 42 / d;

			System.out.println("This will not be printed.");

		} catch (ArithmeticException e) { // catch divide-by-zero error
			System.out.println("Exception: " + e);
			System.out.println("Division by zero.");
		}

		System.out.println("\n=================================");
		
		try {
			String number = "123a";
			int value = Integer.parseInt(number);
		} catch (NumberFormatException ex) {
			System.out.println("Wrong number format");
		}
		
		System.out.println("\n=================================");

		try {
			int a = args.length;
			System.out.println("a = " + a);
			int f = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
		
		System.out.println("\n=================================");
		
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int f = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception 1 : " + e);
		} catch (Exception e) {
			System.out.println("Exception  2 : " + e);
		} catch (Throwable e) {
			System.out.println("Exception 3 : " + e);
		}
		
		System.out.println("After try/catch blocks.");

	}
}
