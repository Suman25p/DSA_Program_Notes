package java_array;

public class C103 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int mid = arr.length /2;
		int total = 0;
		int sum =0;
		for(int i=1; i<arr.length-1; i++) {
			if(i % 2 != 0 && i != mid) {
				total++;
				sum += arr[i];
			}
		}
		double avg = (double) sum/ total;
		System.out.println(avg);
	}
}
