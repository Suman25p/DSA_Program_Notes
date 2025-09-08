package topic1;

public class Q33 {
	public static void main(String[] args) {
		int arr[] = {7,14,21,28,40,20,44,27};
		
		System.out.println("All alternative elements from start");
		for(int i=0; i<arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}
	}
}
