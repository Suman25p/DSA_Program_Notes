package queuetopc;

import java.util.ArrayList;


class MyStack{
	private ArrayList<Integer> stack;
	MyStack(){
		stack = new ArrayList<>();
	}
	public void push(Integer num) {
		stack.add(num);
	}
	public Integer peek() {
		return stack.get(stack.size() -1);
	}
	public Integer pop() {
		return stack.remove(stack.size() -1);
	}
	
	public boolean isEmpty() {
		return stack.size() == 0;
	}
}
public class T49 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
	}
}
