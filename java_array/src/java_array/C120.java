package java_array;

import java.util.Arrays;

public class C120 {
	public static void main(String[] args) {
		int[] arr = {10, 20,30,400, 500, 110, 540};
		System.out.println(Arrays.toString(arr));
		for(int i=0; i< arr.length-2; i++) {
			arr[i] = arr[i+1] + arr[i+2];
		}
		System.out.println(Arrays.toString(arr));
	}
}
