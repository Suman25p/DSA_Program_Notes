package stringtopic;

public class M38 {
	public static void main(String[] args) {
		String s1 = "hello world";
		//           012345678910
		String s2 = s1.substring(0,5);
		String s3 = s1.substring(6,11);
		String s4 = s1.substring(1,1);
		String s5 = s1.substring(6);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
