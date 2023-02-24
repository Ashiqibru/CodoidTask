package org.codoid;

public class Employee {
	
	//Non parameterized constructor
	public Employee() {
		System.out.println("My name is Mohamed Ashiq Ibrahim" );
	}
	
	//parameterized Constructor
    public Employee(long num) {
		System.out.println("My mobile number " + num);
	} 
    
    public Employee(String Qualification) {
		System.out.println("My Qualification is " + Qualification);
	} 
    
    public Employee(int age, String role) {
		System.out.println("My age is " + age);
		System.out.println("My role is " + role);
	} 
    
    public static void main(String[] args) {
		 Employee e  = new Employee();
		 Employee e1 = new Employee(9597329414l);
		 Employee e2 = new Employee("B.E (ECE)");
		 Employee e3 = new Employee(24, "Software Testing");
	}
}
