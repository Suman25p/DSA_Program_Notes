package javacode;
import java.util.HashMap;

public class T60 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("age",30);
		map.put("marks",90);
		map.put("standard",12);
		//map.put("age",30);
		map.put(null,100);
		map.put(null,200);
		map.put("k1",null);
		map.put("k2",null);
		map.put("k3",null);
		
		System.out.println(map);
		System.out.println(map.get("marks"));
		
	}
}
