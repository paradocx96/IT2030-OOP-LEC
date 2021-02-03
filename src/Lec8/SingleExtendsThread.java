package Lec8;

public class SingleExtendsThread extends Thread {
	public static void main(String[] args) {

		SingleExtendsThread object = new SingleExtendsThread();
		object.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Class : " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Error : " + e);
			}
		}

	}

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
