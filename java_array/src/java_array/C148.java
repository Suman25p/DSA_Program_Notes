package java_array;

import java.util.Arrays;

public class C148 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		int a = arr[arr.length -1];
		int b = arr[arr.length -2];
		int c = arr[arr.length -3];
		
		for(int i=arr.length -1; i>2; i--) {
			arr[i] = arr[i-3];
		}
		arr[0] = c;
		arr[1] = b;
		arr[2] = a;
		System.out.println(Arrays.toString(arr));
	}
}
