package javacode;
import java.util.HashSet;
public class Set59 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1000);
		set.add(2000);
		set.add(4000);
		set.add(5000);
		System.out.println(set);
		set.remove(4000);
		System.out.println(set);
		for(Integer obj: set) {
			System.out.println(obj);
		}
		//no set method to update
		//no get method to read
	}
}
