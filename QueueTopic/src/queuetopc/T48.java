package queuetopc;

import java.util.Stack;
public class T48 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.push(600);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
	}
}
