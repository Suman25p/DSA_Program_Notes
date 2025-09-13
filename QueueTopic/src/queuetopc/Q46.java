package queuetopc;
import java.util.Queue;
import java.util.LinkedList;

public class Q46 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		System.out.println("Empty?" + q.isEmpty());
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println("After enqueues:" + q);
		System.out.println("Peek:" + q.peek());
		System.out.println("Dequeue:" + q.poll());
		System.out.println("Size:" + q.size());
		
    }
}
