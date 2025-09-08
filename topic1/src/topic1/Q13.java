package topic1;

public class Q13 {
	public static void main(String[] args) {
		int[] arr = {11,15,21,18,27,33,40,50,60,70};
		
		boolean found = false;
		
		System.out.println("First Even Element:");
		for(int i=0; i<arr.length; i++) {
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
