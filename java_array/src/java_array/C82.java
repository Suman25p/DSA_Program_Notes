package java_array;

public class C82 {
	public static void main(String[] args) {
		int[] arr = {5,10,13,10,21,20,30,27};
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 ==0 && (arr[i]>10 && arr[i] < 25)) {
				System.out.print(arr[i]+",");
			}
		}
	}
}
