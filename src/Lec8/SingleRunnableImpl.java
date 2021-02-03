package Lec8;

public class SingleRunnableImpl implements Runnable {

	public static void main(String[] args) {
		SingleRunnableImpl object = new SingleRunnableImpl();
		object.run();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Class : " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Error : " + e);
			}
		}

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Run Method : " + i);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Error : " + e);
			}
		}

	}

}
