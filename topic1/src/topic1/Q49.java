package topic1;

public class Q49 {
	public static void main(String[] args) {
		int[] arr = {5,9,2,14,8,6,13,3,10,4};
		
		Integer maxOdd = null;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				if(maxOdd == null || arr[i]> maxOdd) {
					maxOdd = arr[i];
				}
			}
		}
		if(maxOdd != null) {
			System.out.println("Biggest element is :"+ maxOdd);
		}else {
			System.out.println("No odd element");
		}

	}
}
