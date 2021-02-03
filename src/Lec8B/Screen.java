package Lec8B;

public class Screen {
	
	public synchronized void display(String message) {
		System.out.print("[ " + message);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ]");
	}
}
