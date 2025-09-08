package topic1;

public class Q34 {
	public static void main(String[] args) {
		int arr[] = {7,14,21, 28,40,20,44,27};
		
		System.out.println("Alternative elements from the elements:");
		
		for(int i=arr.length-1; i>=0; i-=2) {
			System.out.print(arr[i]+ " ");
		}
	}
}
