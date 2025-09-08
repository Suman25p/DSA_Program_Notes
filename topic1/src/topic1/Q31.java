package topic1;

public class Q31 {
	public static void main(String[] args) {
		int arr[] = {10,25,36,72,68,97,90,47,25,26};
		
		System.out.println("All even elements are:");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

