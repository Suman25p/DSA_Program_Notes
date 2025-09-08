package javacode;

public class RecurT69 {
	public static void main(String[] args) {
		test(5);
		
	}
	static void test(int i) {
		if(i==0) {
			return;
		}
		System.out.println("test:" + i);
		i--;
		test(i);
		test(i);
	}
}
