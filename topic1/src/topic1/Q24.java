package topic1;
//doubt
public class Q24 {
	public static void main(String[] args) {
		int[] arr = {112,20,30,47,53,60,71,80,93,100};
		
		int evencount=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evencount++;
				if(evencount==2) {
					System.out.println("Second Index of even"+" "+ i);
					break;
				}
				
			}
			else {
				System.out.println("Less than 2 element found");
			
		}
	}
		
	}
}
