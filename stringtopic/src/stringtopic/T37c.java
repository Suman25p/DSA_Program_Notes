package stringtopic;

public class T37c {
	public static void main(String[] args) {
		String s1 = "abc xyz abc xyz";
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('y'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('y'));
		//System.out.println(s1.indexOf("oll"));
	}
}
