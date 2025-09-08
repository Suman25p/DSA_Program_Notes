package java_array;

public class C88 {
	public static void main(String[] args) {
		int[] arr = {11,12,13,14,15,16,17};
		int mid = arr.length / 2;
		int sum =0;
		for(int i=1; i< arr.length-1; i++) {
			if(i== mid) {
				continue;
			}
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
