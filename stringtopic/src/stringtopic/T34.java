package stringtopic;

public class T34 {
	public static void main(String[] args) {
		String s1 = "abc xyz hello";
		
		for(int i = s1.length()-1; i>=0; i--) {
			System.out.println(s1.charAt(i));
		}
	}
}
