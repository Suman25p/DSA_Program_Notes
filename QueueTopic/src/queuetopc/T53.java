package queuetopc;

interface Test{
	int sum(int i, int j);
}
public class T53 {
	public static void main(String[] args) {
		Test t1 = (i,j) -> i+j;
		
		System.out.println(t1.sum(10,20));
	}
}
