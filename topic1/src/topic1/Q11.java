package topic1;

public class Q11 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print("First two element:");
		for(int i=0;i<2;i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
		System.out.println("Last two element:");
		for(int i=numbers.length-5;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
	}
}
