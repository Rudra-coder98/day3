package day3;

public class MainApp {
	/**
	 * 1. Two Classes used here. MainApp and Student.
	 * 2. Static method is creating, creating the object. 
	 */
	public static void main(String[] args) {
		// using constructor here.
		Student std = new Student();
		
		// using the dot operator data member
		System.out.println(std.id);
		System.out.println(std.name);
		
		// static member
		System.out.println(Student.company);
		
		// using the dot operator member functions
		std.method1();
		std.method1(100);
		
	}

}
