package stringtopic;

public class T37b {
	public static void main(String[] args) {
		String s1 = "hello 123 hello";
		
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.indexOf('h', 5));
		System.out.println(s1.indexOf('o'));
		//System.out.println(s1.indexOf('h'));
		System.out.println(s1.indexOf('o', 9));
	}
}
