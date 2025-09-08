//package javacode;
//
//import linkedlist.LinkedList;
//import linkedlist.Node;
//
//class Node {
//	int data;
//	Node next;
//}
//
//class LinkedList{
//	Node first, last;
//	void add(int data) {
//		//step1
//		Node node = new Node();
//		node.data = data;
//		//step 2
//		if(first == null) {
//			first = node;
//		}
//		else {
//			last.next = node;
//		}
//		//step 3
//		last = node;
//	}
//
//	void read() {
//		Node current = first;
//		while(current != null)
//			System.out.print(current.data + ", ");
//			current = current.next;
//		}
//	System.out.println();
//	}
//}
//public class T74 {
//	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.add(100);
//		list.add(200);
//		list.add(300);
//		list.add(400);
//		list.add(500);
//		list.add(600);
//		list.read();
//	}
//	
//}
