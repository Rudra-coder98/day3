package day3;

public class Student {
	// data member
		public int id;  // 0
		public String name;  // null
		public static String company; // null 
		
		// spciaal member::  constructor :: new keyword
		public Student(){
			System.out.println("I AM SUPER SPECIAL, I AM CALLED USING NEW KEYWORD!");
		}
		public Student(int n) {}
		public Student(int n1, int n2) {}
		
		
		// member function
		public void method1() {
			System.out.println("I am method1, with no param!");
		}
		public void method1(int n1) {
			System.out.println("I am method1, with one param!");
		}
		public void method1(int n1, int n2) {}
		
		public static void main() {}
}


