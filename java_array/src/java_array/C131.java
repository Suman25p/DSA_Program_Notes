package java_array;

import java.util.Arrays;

public class C131 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,400,500,110,540};
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length-3; i++) {
			arr[i] = arr[i+3];
		}
		arr[arr.length-3] = 0;
		arr[arr.length-2] = 0;
		arr[arr.length-1] = 0;
		System.out.println(Arrays.toString(arr));	
	}
}
