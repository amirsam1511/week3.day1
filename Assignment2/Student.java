package org.student;

import org.department.Department;

public class Student extends Department {
	//derived class extends base Class
	
	public void studentName() {
		System.out.println("Student Name is XXX");
	}
	
	public void studentDept() {
		System.out.println("Student Dept is CSE");
	}
	
	public void studentId() {
		System.out.println("Student Id is 1321001");
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		// Creating Multilevel Inheritance by calling all methods in all class
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();

	}

}
