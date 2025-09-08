package topic1;

public class Q12 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print("First five element:");
		for(int i=0;i<5;i++) {
			System.out.print(numbers[i] + " ");
		}
		
		//System.out.println(" ");
		System.out.print("\nLast two element:");
		for(int i=numbers.length-2;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println(" ");
	}
}
