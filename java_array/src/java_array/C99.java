package java_array;

public class C99 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int evenIndexesTotal = 0;
		int evenIndexesSum = 0;
		for(int i=0; i< arr.length; i++) {
			if(i % 2 == 0) {
				evenIndexesTotal ++;
				evenIndexesSum += arr[i];
			}
		}
		double avg = (double) evenIndexesSum / evenIndexesTotal;
		System.out.println(avg);
	}
}
