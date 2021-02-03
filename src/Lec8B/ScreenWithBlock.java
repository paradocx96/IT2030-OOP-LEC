package Lec8B;

public class ScreenWithBlock {

	public void display(String message) {

		//
		//
		//
		//
		//
		//

		synchronized (message) {
			System.out.print("[ " + message);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(" ]");
		}
	}
}
