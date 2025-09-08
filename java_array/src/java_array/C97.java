package java_array;

public class C97 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=1; i< arr.length-1; i++) {
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
