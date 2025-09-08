package java_array;

public class C79 {
	public static void main(String[] args) {
		int[] arr = {100,200,300, 400, 500,600,700,800};
		int middle = arr.length / 2;
		for(int i = middle-2; i< (middle +2) ; i++) {
				System.out.print(arr[i] + ",");
			}
		}
}
