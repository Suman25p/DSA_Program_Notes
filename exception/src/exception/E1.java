package exception;

public class E1 {
	public static void main(String[] args) {
		try {
			MathOperations mathOperations = new MathOperations();
			mathOperations.divideNumbers(10,0);
			
		}catch (ArithmeticException e) {
			System.out.println("Caught in main:" + e.getMessage());
		}
	}
}

class MathOperations {
	public void divideNumbers(int a,int b) throws ArithmeticException {
		try {
			int result = a /b;	
		}catch (ArithmeticException e) {
			System.out.println("Rethrowing exception.");
			throw e;
		}finally {
			System.out.println("Finally block executed.");
		}
	}
}
