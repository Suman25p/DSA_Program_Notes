package stringtopic;

public class T29b {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		s1.replace('h','y');
		System.out.println(s1);
		s1 = s1.replace('h', 'y');
		System.out.println(s1);
	}
}
