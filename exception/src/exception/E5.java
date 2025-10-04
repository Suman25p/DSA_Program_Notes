package exception;

public class E5 {
	public static void main(String[] args) {
		try {
			validateAge(15);
		} catch(IllegalArgumentException e) {
			System.out.println("Caught Exceptions:" + e.getMessage());
		}
	}
	
	public static void validateAge(int age) {
		if(age < 18) {
			throw new IllegalArgumentException("Age must be 18 or elder.");
		}
	}
}
