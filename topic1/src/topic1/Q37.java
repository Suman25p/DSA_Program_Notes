package topic1;

public class Q37 {
	public static void main(String[] args) {
		int arr[] = {7,14,21, 28,40,20,44,27,25,38};
		
//		int mid = arr.length/2;
//		
//		System.out.println("Alternative elements from the elements:");
//		
//		for(int i=arr.length-1; i>=mid; i--) {
//			System.out.print(arr[i]+ " ");
//		}
		
		int n = arr.length;
		if(n%2==0) {
			System.out.println("Second half elements from reverse order:");
			for(int i=n-1; i>=n/2; i--) {
				System.out.println(arr[i]+" ");
			}
		}else {
			System.out.println("Array does not have even number of elements");
		}
	}
}
