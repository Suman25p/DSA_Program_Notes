package topic1;

public class Q28 {
	public static void main(String[] args) {
		int[] arr = {13,20,30,47,53,60,71,80,93,10};
		
		int evencount =0;
		for(int i=arr.length -1; i>= 0; i--) {
			if(arr[i] % 2 == 0) {
				evencount++;
				if(evencount==2) {
				System.out.println("Index of last 2nd even number"+" "+ i);
				return ;
				}
			}
		}
		
		System.out.println("Less than 2 even number found");
	}
}
