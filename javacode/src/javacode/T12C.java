package javacode;

import java.util.Arrays;

public class T12C {
	public static void main(String[] args) {
		int[] arr = { 10,20,30,40,50,60,70,80};
		
		System.out.println(Arrays.toString(arr));
		int temp1 = arr[0];
		int temp2 = arr[1];
		for(int i=2; i<arr.length; i++) {
			arr[i-2] = arr[i];
		}
		arr[arr.length -1] = temp2;
		arr[arr.length -2] = temp1;
		System.out.println(Arrays.toString(arr));
	}
}
