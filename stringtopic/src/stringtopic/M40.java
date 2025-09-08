package stringtopic;

public class M40 {
	public static void main(String[] args) {
		String s1 = "abc hello test great abc";
		String s2 = s1.replace('e', 'y');
		String s3 = s1.replace("abc", "py");
		String s4 = s1.replaceAll("abc","java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
