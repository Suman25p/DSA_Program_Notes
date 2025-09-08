package queuetopc;

import java.util.PriorityQueue;

public class T50 {
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap =new PriorityQueue<Integer>();
		minHeap.add(1000);
		minHeap.add(233);
		minHeap.add(23);
		minHeap.add(2335);
		minHeap.add(2);
		minHeap.add(66233);
		System.out.println(minHeap);
		System.out.println(minHeap.peek());
		System.out.println(minHeap);
		System.out.println(minHeap.poll());
		System.out.println(minHeap);
		System.out.println(minHeap.isEmpty());
		
	}
}
