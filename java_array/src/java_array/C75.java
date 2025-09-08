package java_array;

public class C75 {
	public static void main(String[] args) {
		int[] arr = {100,2,3, 400, 500,6,700,800,9,1000};
		for(int i= 0; i<arr.length; i++) {
			if(arr[i] % 5 ==0) {
				System.out.print(arr[i]+ ",");
			}	
		}
	}
}
