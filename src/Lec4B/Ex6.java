package Lec4B;

class IDIncorrectException extends Exception {
	
	public IDIncorrectException(String message) {
		super(message);
	}
}

public class Ex6 {
	public static void main(String[] args) {
		
		String ID = "19180526";
		
		try {
			if (!ID.startsWith("IT")) {
				throw new IDIncorrectException("ID Number not Starting with IT");
			}
		} catch (IDIncorrectException e) {
			System.out.println("Error : " + e);
		}

	}

}
