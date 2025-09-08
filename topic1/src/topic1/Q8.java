package topic1;

public class Q8 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100,101,102,103,104,105,106,107};
		
		int n =numbers.length;
		System.out.print("last 4 elements :");
		for(int i=n-4 ;i<n; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
