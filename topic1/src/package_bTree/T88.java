package package_bTree;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class T88 {
	
	static boolean isFull(Node root) {
		if(root == null) {
			return true;
		}
		if(root.left == null && root.right == null) {
			return true;
		}
		if(root.left != null && root.right != null) {
			boolean leftCheck = isFull(root.left);
			boolean rightCheck = isFull(root.right);
			if(leftCheck &&  rightCheck) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(120);
		Node n3 = new Node(210);
		Node n4 = new Node(130);
		Node n5 = new Node(410);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		
//		System.out.println(n1.data);
//		System.out.println(n1.left.data);
//		System.out.println(n1.right.data);
//		System.out.println(n1.left.data);
//		System.out.println(n1.left.left.data);
//		System.out.println(n1.left.right.data);
		
		
		System.out.println(isFull(n1));
	}
}
