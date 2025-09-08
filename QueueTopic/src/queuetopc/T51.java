package queuetopc;

import java.util.PriorityQueue;

class MinHeap{
	private PriorityQueue<Integer> heap;
	public MinHeap() {
		heap = new PriorityQueue<Integer>();
	}
	public void push(Integer element) {
		heap.add(element);
	}
	public Integer peek() {
		return heap.peek();
	}
	public Integer poll() {
		return heap.poll();
	}
	public boolean isEmpty() {
		return heap.size() == 0;
	}
	@Override
	public String toString() {
		return heap.toString();
	}
	
}
public class T51 {
	public static void main(String[] args) {
		MinHeap heap = new MinHeap();
		heap.push(100);
		heap.push(200);
		heap.push(400);
		heap.push(300);
		heap.push(700);
		
		System.out.println(heap);
		System.out.println(heap.peek());
		System.out.println(heap);
		System.out.println(heap.poll());
		System.out.println(heap);
		//System.out.println(heap);
		
	}

}
