package org.login;
public class Student {

	public void studentId() {
		System.out.println("student id is 456789");
		this.studentName();
		studentAddress();
	}
	
	public void studentName() {
		System.out.println("student name is RAvi");
	}
	
	public void studentAddress() {
		System.out.println("student address is OMR");
	}
	
	public static void main(String[] args) {
		
		Student a = new Student();
		a.studentId();
		
	}

	
	
}
