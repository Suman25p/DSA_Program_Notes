package java_array;

public class C95 {
	public static void main(String[] args) {
		int[] arr = {10, 21, 30, 41};
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			if(i % 2 == 0 && arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
