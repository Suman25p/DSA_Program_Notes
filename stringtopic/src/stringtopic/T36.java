package stringtopic;

import java.util.Arrays;

public class T36 {
	public static void main(String[] args) {
		char[] chars = {'a','b','c','h','e','l','l','o'};
		System.out.println(Arrays.toString(chars));
		
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
