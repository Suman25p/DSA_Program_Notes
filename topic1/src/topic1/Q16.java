package topic1;

public class Q16 {
	public static void main(String[] args) {
		int[] arr = {11,15,21,18,27,33,40,50,60,81};
		
		boolean found = false;
		
		System.out.println("Last odd element:");
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] % 2 != 0) {
				System.out.println(arr[i] + " ");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("No odd element");
		}
		
	}
}
