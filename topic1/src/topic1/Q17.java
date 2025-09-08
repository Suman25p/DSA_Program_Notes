package topic1;

public class Q17 {
	public static void main(String[] args) {
		int[] arr = {11,15,21,18,27,33,40,50,60,81};
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]% 2 !=0) {
				count++;
				if(count==3) {
					System.out.println("3rd odd element" + arr[i]);
					return;
				}
			}
		}
		System.out.println("No 3rd odd number found");
	}
}
