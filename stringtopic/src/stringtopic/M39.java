package stringtopic;

public class M39 {
	public static void main(String[] args) {
		String s1 = "abc xyz hello test";
		String[] splits = s1.split( " ");
		for(String split : splits) {
			System.out.println(split);
		}
		System.out.println("----------------");
		String s2 = "abc;xyz;hello;123;hi";
		splits = s2.split(";");
		for(String split : splits) {
			System.out.println(split);
			//System.out.println();
		}
	}
}
