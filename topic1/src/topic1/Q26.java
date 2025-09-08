package topic1;

public class Q26 {
	public static void main(String[] args) {
		int[] arr = {13,20,30,47,53,60,71,80,93,10};
			
		for(int i=arr.length -1; i>= 0; i--) {
			if(arr[i] % 2 == 0) {
				System.out.println("Index"+" "+ i);
				return ;
			}
		}
		
		System.out.println("Not found");
	}
}
