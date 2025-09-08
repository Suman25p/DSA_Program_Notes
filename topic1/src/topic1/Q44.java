package topic1;

public class Q44 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		
		//3rd time practice
		int n = arr.length;
		System.out.println("Output:");
		if(n%2==0) {
			int left = (n/2)-1;
			int right = n/2;
			
			while(left>=0 && right<n) {
				System.out.print(arr[left]+ " ");
				System.out.print(arr[right]+ " ");
				left--;
				right++;
			}
		}else {
			int center = n/2;
			System.out.print(arr[center]+ " ");
			int offset = 1;
			
			while(center - offset >= 0 || center+ offset <n ) {
				if(center - offset >=0)
					System.out.print(arr[center - offset]+ " ");
				if(center + offset >=0)
					System.out.print(arr[center+offset]+ " ");
				offset++;
			}
		}
		
		
		//2nd time practice
//		int n = arr.length;
//		System.out.println("Output:");
//		if(n%2==0) {
//			int left = n/2 -1;
//			int right = n/2;
//			
//			while(left>=0 && right<n) {
//				System.out.print(arr[left]+ " ");
//				System.out.print(arr[right]+ " ");
//				left--;
//				right++;
//			}
//			
//		}else {
//			int center = n/2;
//			System.out.print(arr[center]+ " ");
//			int offset = 1;
//			
//			while(center - offset >=0 || center+offset <n) {
//				if(center - offset >=0)
//					System.out.print(arr[center - offset]+ " ");
//				if(center + offset >=0)
//					System.out.print(arr[center+offset]+ " ");
//				offset++;
//			}
//		}
		
		//1st practice
//		int n = arr.length;
//		
//		System.out.println("Output:");
//		if(n%2 == 0) {
//			int left = n/2 -1;
//			int right = n/2;
//			
//			while(left >=0 && right <n) {
//				System.out.print(arr[left]+ " ");
//				System.out.print(arr[right]+ " ");
//				left--;
//				right++;
//			}
//		}else {
//			int center = n/2;
//			System.out.print(arr[center]+ " ");
//			int offset = 1;
//			
//			while(center - offset >= 0 || center+ offset <n) {
//				if(center - offset >=0 )
//					System.out.print(arr[center - offset]+ " ");
//				if(center + offset >=0)
//					System.out.print(arr[center+offset]+ " ");
//				offset++;
//			}
//		}
		
		
		//class me hua
		
//		int n = arr.length;
//		
//		 System.out.println("Output:");
//		 if(n%2 == 0) { //even length
//			 int left = n/2 -1;
//			 int right = n/2;
//			 
//			 while(left >=0 && right <n ) {
//				 System.out.print(arr[left]+ " ");
//				 System.out.print(arr[right]+ " ");
//				 left--;
//				 right++;
//			 }
//		 }else { //for odd length
//			 int center = n/2;
//			 System.out.print(arr[center]+ " ");
//			 int offset = 1;
//			 
//			 while(center - offset >=0 || center+offset < n) {
//				 if(center - offset >=0)
//					 System.out.print(arr[center-offset] + " ");
//				 if(center + offset >=0)
//					 System.out.print(arr[center+offset] + " ");
//				 offset++;
//				 
//			 }
//		 }	
	}
}
