package topic1;

public class Q23 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,47,53,60,71,80,93,100};
		
		boolean found = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.println("Index"+" "+ i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Not found");
		}
	}
}
