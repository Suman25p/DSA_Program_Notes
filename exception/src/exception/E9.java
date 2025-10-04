package exception;
class Parent {
	//Parent class mthod declares an exception using 'throws'
	public void display() throws Exception {
		System.out.println("Parent class display method.");
	}
}

class Child extends Parent{
	//Child class override the method
	@Override
	public void display() {
		System.out.println("Child class display method.");
	}
}
public class E9 {
	public static void main(String[] args) {
		Parent obj = new Child();
		try {
			obj.display();
		}catch(Exception e) {
			System.out.println("Exception caught:" + e.getMessage());
		}
	}

}
