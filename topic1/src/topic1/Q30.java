package topic1;

public class Q30 {
	public static void main(String[] args) {
		int[] arr = {13,20,30,47,53,60,71,80,93,10};
		//part 1
		int evencount= 0;
		int oddcount =0;
		boolean oddFound = false;
		

		for(int i=arr.length -1; i>= 0; i--) {
			if(arr[i] % 2 != 0) {
				oddcount++;
				if(oddcount==3) {
				System.out.println("Index of last 3rd odd number"+" "+ i);
				oddFound = true;
				break;
				}
			}
		}
		if(!oddFound) {
		System.out.println("Less than 3 odd number found");
		}
		
		//part 2
		boolean evenFound = false;
		for(int i=0; i<=arr.length;i++) {
			if(arr[i] % 2 == 0) {
				evencount++;
				if(evencount==1) {
				System.out.println("Index of first even number"+" "+ i);
				evenFound = true;
				break;
				}
			}
		}
		if(!evenFound) {
		System.out.println("Less than 3 odd number found");
		
		}
	}

}
