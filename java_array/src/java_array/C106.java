package java_array;

import java.util.Arrays;

public class C106 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("initial content:" + Arrays.toString(arr));
		arr[0] = 25;
		arr[1] = 45;
		System.out.println("final content:" + Arrays.toString(arr));
	 
	}
}
