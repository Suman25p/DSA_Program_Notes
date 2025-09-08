package java_array;

import java.util.Arrays;

public class C125 {
	public static void main(String[] args) {
		int[] arr = {10, 20,30,400, 500, 110, 540};
		System.out.println(Arrays.toString(arr));
		int mid = arr.length /2;
		for(int i=0; i< arr.length;i++) {
			if(i < mid) {
				arr[i] ++;
			}else {
				arr[i]--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
