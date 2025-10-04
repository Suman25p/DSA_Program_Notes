package exception;
import java.io.IOException;

public class E3 {
	public static void main(String[] args) {
		try {
			validateAge(17); //Calling a method throwing an exception
		}catch (IllegalArgumentException e) {
			System.out.println("Caught Exception:" + e.getMessage());
		}
	}
	
	public static void validateAge(int age) {
		//Should throw an exception , but it does not
		System.out.println("Age is valid.");
	}
}
