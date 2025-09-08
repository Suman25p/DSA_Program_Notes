package topic1;

public class Q15 {
	public static void main(String[] args) {
		int[] arr = {11,15,21,18,27,33,40,50,60,77};
		
		boolean found = false;
		
		System.out.println("First odd element found:");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]% 2 != 0) {
				System.out.println(arr[i] + " ");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("No odd element found");
		}
	}
}
