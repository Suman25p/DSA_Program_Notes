package topic1;

public class Q47 {
	public static void main(String[] args) {
		int[] arr = { 12,34,56,79,90,108};
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the size of the array: ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		
//		System.out.println("Enter" +" " + size +" " + "elements:");
//		for(int i=0; i<size; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("You entered:");
//		for(int i=0; i<size; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
		Integer maxEven = null;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]% 2 == 0) {
				if(maxEven == null || arr[i]>maxEven) {
					maxEven = arr[i];
				}
			}
		}
		if(maxEven != null) {
			System.out.println("\nBiggest even element:" + maxEven);
		}else {
			System.out.println("No even element");
		}

	}
}
