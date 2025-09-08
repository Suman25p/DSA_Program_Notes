package java_array;

public class C98 {
	public static void main(String[] args) {
		int[] arr = {10, 20,30,40, 50};
		int sum =0;
		int mid = arr.length /2;
		for(int i=1; i<arr.length-1; i++) {
			if(i % 2 != 0 && i != mid) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
