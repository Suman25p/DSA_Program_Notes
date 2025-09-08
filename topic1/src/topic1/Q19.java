package topic1;

public class Q19 {
	public static void main(String[] args) {
		int[] arr = {11,15,21,18,27,33,40,50,60,81};
		
		int total = arr.length;
		int oddcount = 0;
		int evencount = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.println("Total Element"+ " "+ total);
		System.out.println("Total Even"+" "+ evencount);
		System.out.println("Total Odd"+" "+ oddcount);
		
	}
}
