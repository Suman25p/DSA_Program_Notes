package topic1;

public class Q14 {
	public static void main(String[] args) {
		int[] arr = {11,15,21,18,27,33,40,50,60,77};
		
		boolean found = false;
		
		System.out.println("Last even element:");
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i] + " ");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("No even element found");
		}
	}
}
