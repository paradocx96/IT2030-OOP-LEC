package Lec4B;

public class Ex2 {

	public static void main(String[] args) {
		try {
			//statement 1;
			//statement 2;
			//try-catch block inside another try block
			try {
				//statement 3;
				//statement 4;
				//try-catch block inside nested try block
				try {
					//statement 5;
					//statement 6;
				} catch(Exception e2) {
					//Exception Message
				}
			} catch(Exception e1) {
				//Exception Message
			}
		} catch(Exception e3) { //Catch of Main(parent) try block
			//Exception Message
		}

	}

}
