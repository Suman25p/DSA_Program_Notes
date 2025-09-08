package topic1;

public class Q50 {
	public static void main(String[] args) {
		int[] arr = {5,9,2,14,8,6,13,3,10,4};
		

		Integer minOdd = null;
	
	for(int i=0; i<arr.length;i++) {
			if(arr[i] % 2!= 0) {
				if(minOdd == null || arr[i] < minOdd) {
					minOdd = arr[i];
				}
			}
		}
		if(minOdd != null) {
			System.out.println("Smallest odd element:"+ minOdd);
		}else {
			System.out.println("No odd element found");
		}
	}
}
