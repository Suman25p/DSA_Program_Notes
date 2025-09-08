package topic1;

public class Q46 {
		public static void main(String[] args) {
			int[] arr = {5,9,2,14,8,6,12,3,10,4};
			

		int min = arr[0];	
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] <arr[min]) {
				min = arr[i] ;
			}
		}
		System.out.print("Smallest element:" + min);
	 
		}
}
