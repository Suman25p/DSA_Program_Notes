package java_array;

import java.util.Arrays;

public class C109 {
	public static void main(String[] args) {
		int[] arr = new int[11];
		System.out.println(Arrays.toString(arr));
		int midIndex = arr.length / 2;
		arr[midIndex] = 25;
		System.out.println(Arrays.toString(arr));
	 
	}
}
