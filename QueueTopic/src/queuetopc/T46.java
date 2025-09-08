package queuetopc;

import java.util.LinkedList;
//import java.util.Queue;

public class T46 {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(1000);
		queue.add(2000);
		queue.add(3000);
		queue.add(4000);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
