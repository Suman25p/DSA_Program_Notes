package topic1;

public class Q32 {
	public static void main(String[] args) {
		int arr[] = { 11,13,15,26,27,23,87,45,90};
		
		System.out.print("All odd elements are :");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]% 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
