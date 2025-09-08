package javacode;
import java.util.HashMap;

public class T61 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 1000);
		map.put("xyz", 2000);
		System.out.println(map.get("xyz"));
		System.out.println(map);
		map.put("xyz", 5000);
		System.out.println(map);
		map.remove("abc");
		System.out.println(map);
	}

}
