package Lec4B;

public class Ex3 {

	public static void main(String[] args) {

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");

		System.out.println("\n==================================");

		try {
			String number = "123a";
			int value = Integer.parseInt(number);
		} catch (NumberFormatException ex) {
			System.out.println("Wrong number format");
		} finally {
			System.out.println("End of operation");
		}

	}

}
