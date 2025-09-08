package java_array;

import java.util.Arrays;

public class C104 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("Initial content:"+ Arrays.toString(arr));
		arr[0] = 35;
		System.out.println("Final content:" + Arrays.toString(arr));
	}
}
