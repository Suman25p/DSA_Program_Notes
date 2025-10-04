package exception;

class Parent{
	public void display() throws IOException {
		System.out.println("Parent display method");
	}
}

class Child extends Parent{
	@Override
	public void display() throws FileNotFoundException {
		System.out.println("Child display method");
	}
}
public class E10 {
	public static void main(String[] args) {
		Parent obj = new Child();
		try {
			obj.display();
		}catch (IOException e) {
			System.out.println("Exception caught:" + e);
		}
	}

}
