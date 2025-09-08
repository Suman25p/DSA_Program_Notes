package java_array;

import java.util.Arrays;

public class C110 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println(Arrays.toString(arr));
		int mid = arr.length /2;
		arr[mid -1] = 25;
		arr[mid] = 200;
		
		System.out.println(Arrays.toString(arr));
		
	}
}
