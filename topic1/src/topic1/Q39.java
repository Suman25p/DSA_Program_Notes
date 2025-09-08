package topic1;

public class Q39 {
	public static void main(String[] args) {
		
		int arr[] = {7,14,21, 28,40,20,44,27,25,38,40};
		
		System.out.println("Indexes where elements is greater than its right neighbour:");
	
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				System.out.print(i + " ");
			}
		}
		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]>arr[i+1]) {
//				System.out.print(i + " ");
//			}
//		}
		

		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]>arr[i+1]) {
//				System.out.print(i + " ");
//			}
//		}
		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]>arr[i+1]) {
//				System.out.print(i + " ");
//			}
//		}
		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i] > arr[i+1]) {
//				System.out.print(i+ " ");
//			}
//		}
		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]> arr[i+1]) {
//				System.out.println(i+ " ");
//			}
//		}
	}
}
