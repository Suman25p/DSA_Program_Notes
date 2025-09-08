package java_array;

public class C92 {
	public static void main(String[] args) {
		int[] arr= {5,6,7,8};
		int sum=0;
		for(int i=1; i<arr.length-1; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / (arr.length -2);
		System.out.println(avg);
	}
}
