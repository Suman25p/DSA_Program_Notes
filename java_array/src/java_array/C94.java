package java_array;

public class C94 {
	public static void main(String[] args) {
		int[] arr = {1,5,8,9, 4,18,3};
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
