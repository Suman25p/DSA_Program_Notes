package queuetopc;

import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[" + name + ":"  + age + "]"; 
	}
	@Override
	public int compareTo(Person o) {
		return age -((Person)o).age;
	}
}
public class T54 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("ramu", 22));
		list.add(new Person("mohan", 27));
		list.add(new Person("kiran", 25));
		//list.add(new Person("ramu", 22));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
