package Lec8;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("Hello world in RunnableImpl # " + i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Error : " + e); 
			}
		}
		
	}

}
