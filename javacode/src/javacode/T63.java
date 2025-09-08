package javacode;

import java.util.ArrayDeque;

public class T63 {
	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.addFirst(1000);
		dq.addFirst(2000);
		dq.addLast(3000);
		dq.addLast(50000);
		System.out.println(dq);
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		System.out.println(dq.removeFirst());
		System.out.println(dq.removeLast());
		System.out.println(dq);
	}
}
