package Lec8;

public class ThreadImpl extends Thread {

	public void run() {
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Hello world in ThreadImpl : " + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Error : " + e); 
			}
		}
	}
}
