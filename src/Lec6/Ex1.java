package Lec6;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {

		// Create an array list.
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Add elements to the array list.
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("Contents of al: " + al);
		System.out.println("Size of al: " + al.size());
		
		al.remove(3);

		for (int item : al) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n");
		
		// Get the array.
		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);
		
		int sum = 0;
		// Sum the array.
		for (int i = 0; i < ia.length; i++) {
			sum += i;
		}		
		System.out.println("Sum is: " + sum);

	}

}
