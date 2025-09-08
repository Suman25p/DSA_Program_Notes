package javacode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//for character frequency
public class Test {
	public static void main(String[] args) {
		//step 1 character frequency count
		String s1 = "abbcdcfcdggdfc";
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(char c1: s1.toCharArray()) {
			map.put(c1, map.getOrDefault(c1, 0) + 1);
		}
		System.out.println(map);
		//step 2 using comparator using lambda expression with priorityQueue
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a1, a2)-> map.get(a2) - map.get(a1));
		
		pq.addAll(map.keySet());
		System.out.println(pq);
		
		//step 3 for printing all the character orderwise
		StringBuilder builder = new StringBuilder();
		char c1;
		int count;
		while(!pq.isEmpty()) {
			c1 = pq.poll();
			count = map.get(c1);
			for(int i = 1; i<= count; i++) {
				builder.append(c1);
			}
		}
		//return builder.toString();
		System.out.println(builder);	
	}
}
