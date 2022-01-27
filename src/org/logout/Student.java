package org.logout;
//Child Class
public class Student extends Employee
{
	private void studentId() {
		System.out.println("student id is 2345");
	}
	public static void main(String[] args) {
		Student a = new Student();
		a.employeeId();
		a.studentId();
	}
}
