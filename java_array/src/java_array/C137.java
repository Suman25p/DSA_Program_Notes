package java_array;

import java.util.Arrays;

public class C137 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,400,500,110,540,900,200,23};
		System.out.println(Arrays.toString(arr));
		int first = arr[0];
		int second = arr[1];
		for(int i = 0; i<arr.length-2; i++) {
			arr[i] = arr[i+2];
		}
		arr[arr.length-2] = first;
		arr[arr.length-1] = second;
		
		System.out.println(Arrays.toString(arr));	
	}
}
