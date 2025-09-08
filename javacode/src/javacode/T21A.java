package javacode;

import java.util.Arrays;

public class T21A {
	public static void main(String[] args) {
		int[] arr = {5,1,10,6,2,9,3,8};
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
