package topic1;

public class Q38 {
	public static void main(String[] args) {
		
		int arr[] = {7,14,21, 28,40,20,44,27,25,38,40,99};
		
		
		int n = arr.length;
		if(n%2==0) {
			System.out.println("Alternative elements from 1st half in reverse order:");
			for(int i = (n/2)-1;i>=0; i-=2) {
				System.out.print(arr[i] + " ");
			}
		}
		
//		int n= arr.length;
//		if(n%2==0) {
//			System.out.println("Alternative elements from 1st half in reverse order");
//			for(int i=(n/2)-1; i>=0; i-=2) {
//				System.out.println(arr[i]+ " ");
//			}
//		}
		
//		int n = arr.length;
//		if(n%2==0) {
//			System.out.println("Alternative elements from 1st half in reverse order:");
//			for(int i=(n/2)-1 ; i>=0; i-=2) {
//				System.out.println(arr[i]+ " ");
//			}
//		}else {
//			System.out.println("Array does not have even number of elements");
//		}
		
		
		
//		int n = arr.length;
//		if(n%2 == 0) {
//			System.out.println("alternative elements from 1st half in reverse order:");
//			for(int i=(n/2)-1; i>=0; i-=2) {
//				System.out.println(arr[i]+" ");
//			}
//		}else {
//			System.out.println("Array does not have even number of elements");
//		}

	}
}
