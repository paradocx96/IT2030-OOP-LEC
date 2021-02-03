package Lec8B;

public class Main {

	public static void main(String[] args) {

		ScreenWithBlock object = new ScreenWithBlock();
		
		ChildThread t1 = new ChildThread(object, "Hello");
		ChildThread t2 = new ChildThread(object, "World");

	}

}
