package java_array;

import java.util.Arrays;

public class C108 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("initial content:" + Arrays.toString(arr));
		arr[arr.length-1] = 25;
		arr[arr.length-2] = 85;
		System.out.println("final content:" + Arrays.toString(arr));
	 
	}
}
