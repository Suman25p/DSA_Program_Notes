package java_array;

import java.util.Arrays;

public class C128 {
	public static void main(String[] args) {
		int[] arr = {10, 20,30,400, 500, 110, 540};
		System.out.println(Arrays.toString(arr));
		for(int i=1; i< arr.length-1; i++) {
			arr[i] = arr[0]+ arr[arr.length-1];
		}
		System.out.println(Arrays.toString(arr));
		}
}
