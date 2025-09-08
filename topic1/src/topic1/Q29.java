package topic1;

public class Q29 {
	public static void main(String[] args) {
		int[] arr = {13,20,30,47,53,60,71,80,93,10};
		
		int oddcount =0;
		for(int i=arr.length -1; i>= 0; i--) {
			if(arr[i] % 2 != 0) {
				oddcount++;
				if(oddcount==3) {
				System.out.println("Index of last 3rd odd number"+" "+ i);
				return ;
				}
			}
		}
		
		System.out.println("Less than 3 odd number found");
	}
}
