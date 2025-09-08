package java_array;

public class C100 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int total = 0;
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			if(i% 2 != 0 && arr[i] % 2 == 0) {
				total++;
				sum += arr[i];
			}
		}
		double avg = (double) sum / total;
		System.out.println(avg);
	}
}
