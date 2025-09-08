package javacode;
import java.util.PriorityQueue;
public class T62 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(900);
		queue.add(9100);
		queue.add(1900);
		queue.add(9001);
		queue.add(2900);
		queue.add(2900);
		queue.add(2900);
		queue.add(2900);
		queue.add(290);
		//queue.add(null);
		System.out.println(queue);
		queue.remove(9001);
		System.out.println(queue);
	}
}
