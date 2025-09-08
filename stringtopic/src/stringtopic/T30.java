package stringtopic;

public class T30 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "abc";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		
		
		System.out.println(s1);
		//s1.replace('h','y');
		System.out.println(s2);
		//s1 = s1.replace('h', 'y');
		System.out.println(s3);
		System.out.println(s4);
	}
}
