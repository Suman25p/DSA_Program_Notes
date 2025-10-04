package exception;

public class E2 {
	public static void main(String[] args) {
		try {
			method1();
		}catch (IOException e) {
			System.out.println("Caught IOException in main:" + e.getMessage());
		}
	}
	
	//method1 declares an exception and ducks it to the caller
	public static void method1() throws IOException {
		method2(); //Calls method2 which also throws an exception
	}
	
	//method2 throws the exception
	public static void method2() throws IOException {
		throw new IOException("Exception From Method2.");
	}
}
