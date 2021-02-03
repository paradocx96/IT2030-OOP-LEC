package Lec5;

public class Ex3 {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			builder.append("Build " + i + " ");
		}
		
		System.out.println("Result : " + builder);
		
		StringBuilder builder2 = new StringBuilder("StingBuilder");
		
		builder2.insert(2, "===");
		
		System.out.println("Changed : " + builder2);
	}

}
