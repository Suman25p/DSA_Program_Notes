package queuetopc;

import java.util.ArrayList;
import java.util.Collections;
class Employee{
	String name;
	int age;
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[" + name + ":"  + age + "]"; 
	}
}
public class T55 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ramu", 22));
		list.add(new Employee("mohan", 27));
		list.add(new Employee("kiran", 25));
		list.add(new Employee("suman", 26));
		
		System.out.println(list);
		Collections.sort(list, (p1,p2)-> p1.age - p2.age);
		System.out.println(list);
		Collections.sort(list, (p1,p2)-> p1.name.compareTo(p2.name));
		System.out.println(list);
		
	}

}

