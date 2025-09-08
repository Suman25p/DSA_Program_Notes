package java_array;

import java.util.Arrays;

public class C112 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,400,500,110,540};
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));	
	}
}
