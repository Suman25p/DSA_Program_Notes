package exception;

public class E8 {
	public static void main(String[] args) {
		try {
			int result = 10/0;
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException.");
		} finally {
			System.out.println("Finally block executed.");
		}
		System.out.println("Program continues.");
	}
}
