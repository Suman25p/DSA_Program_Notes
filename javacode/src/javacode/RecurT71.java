package javacode;

public class RecurT71 {
	public static void main(String[] args) {
		test1(10);
	}
	static void test1(int i) {
		if( i== 0) {
			return;
		}
		System.out.println("test1:"+ i);
		i--;
		test2(i);
	}
	static void test2(int i) {
		if( i== 0) {
			return;
		}
		System.out.println("test2:"+ i);
		i--;
		test1(i);
	}
}
