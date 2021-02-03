package Lec7;

public class Main {

	public static void main(String[] args) {

		TwoGen<Integer, String> values = new TwoGen<Integer, String>(0001, "Dilanga Lankesh");

		values.showType();

		int v = values.getOb1();

		System.out.println("Values is : " + v);

		String s = values.getOb2();

		System.out.println("Values is : " + s);

		// Bounded Type Parameters

		Integer inums[] = { 1, 2, 3, 4, 5 };
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		Stats<Integer> ob1 = new Stats<Integer>(inums);
		Stats<Double> ob2 = new Stats<Double>(dnums);

		double i = ob1.average();
		System.out.println("Average : " + i);

		double d = ob2.average();
		System.out.println("Average : " + d);

	}

}
