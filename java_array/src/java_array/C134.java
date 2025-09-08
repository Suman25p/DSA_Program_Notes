package java_array;

import java.util.Arrays;

public class C134 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,400,500,110,540,900,200,23};
		System.out.println(Arrays.toString(arr));
		int mid = arr.length /2;
		for(int i = mid+1; i<arr.length-2; i++) {
			arr[i] = arr[i+2];
		}
		arr[arr.length-2] = 0;
		arr[arr.length-1] = 0;
		System.out.println(Arrays.toString(arr));	
	}
}
