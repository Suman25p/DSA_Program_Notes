package topic1;

public class Q48 {
	public static void main(String[] args) {
		
	
	int[] arr = {5,9,2,14,8,6,13,3,10,4};
	Integer minEven = null;
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] % 2 == 0) {
			if(minEven == null || arr[i]< minEven) {
				minEven = arr[i];
			}
		}
	}
	if(minEven != null) {
		System.out.println("Smallest element is : " + minEven);
	}else {
		System.out.println("No even element");
	}
//	Integer minEven = null;
//	
//	for(int i=0; i<arr.length;i++) {
//		if(arr[i] % 2== 0) {
//			if(minEven == null || arr[i] < minEven) {
//				minEven = arr[i];
//			}
//		}
//	}
//	if(minEven != null) {
//		System.out.println("Smaallest even element:"+ minEven);
//	}else {
//		System.out.println("No even element found");
//	}
  }
}
