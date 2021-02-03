package Lec4B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String text = "";
		System.out.print("Enter an integer value : ");
		text = in.readLine();
		int num = Integer.parseInt(text);
		System.out.println("You inserted " + num);

	}

}
