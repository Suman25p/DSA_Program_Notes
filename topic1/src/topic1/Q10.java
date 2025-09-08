package topic1;

public class Q10 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		
		int first_element = numbers[0];
		int second_element = numbers[1];
		
		int secondlast_element = numbers[numbers.length-2];
		int last_element = numbers[numbers.length-1];
		
		
		System.out.println("First two elements" + first_element + " "+ second_element);
		System.out.println("last two elements" + secondlast_element + " "+ last_element);
		//System.out.println("First Element" + secondlast_element);
		//System.out.println("Second Element" + last_element);
		
		
	}
}
