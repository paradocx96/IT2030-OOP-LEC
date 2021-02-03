package Lec8;

public class myThread {
	public static void main(String[] args) {
		
		ThreadImpl object = new ThreadImpl();
		object.start();
		
		RunnableImpl object2 = new RunnableImpl();
		object2.run();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Hello world in main myThread = " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error : " + e); 
			}
		}
		
		
	}
}
