package java_array;

public class C93 {
	public static void main(String[] args) {
		int[] arr = {5, 6,7,8,9};
		int mid = arr.length / 2;
		int sum = 0;
		for(int i=1; i<arr.length -1; i++) {
			if(i == mid) {
				continue;
			}
			sum += arr[i];
		}
		double avg = (double) sum /(arr.length - 3);
		System.out.println(avg);
	}
}
