package java_array;

import java.util.Arrays;

public class C144 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		int mid = arr.length /2;
		for(int i=arr.length -1; i> (mid+1); i--) {
			arr[i] = arr[i-2];
		}
		arr[mid] = 0;
		arr[mid+1] = 0;
		System.out.println(Arrays.toString(arr));
	}
}
