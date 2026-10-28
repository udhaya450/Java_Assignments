package com.java.Assignment03;

public class StudentRecord {
	int Rollno;
	String studentName;
	double Marks;
	
	StudentRecord(int Rollno,String studentName,double Marks){
		this.Rollno=Rollno;
		this.studentName=studentName;
		this.Marks=Marks;
		
	}
	StudentRecord(StudentRecord s1){
		this.Rollno=s1.Rollno;
		this.studentName=s1.studentName;
		this.Marks=s1.Marks;
		
	}
	void display() {
		System.out.println("Student Name :"+ studentName);
		System.out.println("Student Roll Number :" + Rollno);
		System.out.println("Student Mark :"+ Marks);
	}

	public static void main(String[] args) {
		StudentRecord s1=new StudentRecord(21,"Bill",84);
		StudentRecord s2=new StudentRecord(22,"Michael",91);
		s1.display();
		s2.display();
		
		

	}

}


//5.Scenario: A school needs to create a new student record by copying the details of an existing 
//student. 
//Requirements: 
//1. Create a class StudentRecord with rollNumber, studentName, and marks. 
//2. Create a parameterized constructor to initialize the original student's details. 
//3. Create a copy constructor that accepts another StudentRecord object and copies its 
//values. 
//4. Create an original student object and a copied student object. 
//5. Change the copied student's marks and display both records. 
//Task: Verify that changing the copied object's marks does not change the original object's 
//marks.