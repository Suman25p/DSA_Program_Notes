package javacode;

public class RecurT68 {
	public static void main(String[] args) {
		test(5);
		
	}
	static void test(int i) {
		if(i==0) {
			return;
		}
		test(--i);
		System.out.println("test:"+ i);
	}
}
