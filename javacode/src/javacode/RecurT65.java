package javacode;

public class RecurT65 {
	public static void main(String[] args) {
		test(10);
		
	}
	static void test(int i) {
		if(i== 1) {
			return;
		}
		System.out.println("test:" + i);
		i--;
		test(i);
	}
}
