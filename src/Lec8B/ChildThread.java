package Lec8B;

public class ChildThread extends Thread{
	
	ScreenWithBlock ob;
	String message;
	
	public ChildThread(ScreenWithBlock screen, String message) {
		super();
		this.ob = screen;
		this.message = message;
		start();
	}

	public void run() {
		ob.display(message);
	}
}
