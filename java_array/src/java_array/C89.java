package java_array;

public class C89 {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / arr.length;
		System.out.println(avg);
	}
}
