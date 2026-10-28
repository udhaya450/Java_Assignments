package com.java.Assignment03;

public class Student {
	int studentId;
	String studentName;
	String course;
	
	void Display() {
		System.out.println("Student Id:" + studentId);
		System.out.println("Student Name:" + studentName);
		System.out.println("Selected Course :" + course);
		
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.Display();
		
	}

}


//1.Scenario: A college wants to register a student with default information when no details are 
//provided. 
//Requirements: 
//1. Create a class Student with variables studentId, studentName, and course. 
//2. Create a class with no explicitly declared constructor and observe the default values 
//assigned to its instance variables. 
//3. Create a method displayDetails() to display the student information. 
//4. Create an object and call the display method. 
//Task: What values will be displayed if the variables are not initialized? 
