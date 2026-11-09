package com.java.Assignment04_oopsContinue;

//1.A student management system needs to create student objects with different details. Some students have only a name, while others have a name and age.
//Write a Java program using constructor overloading to create student objects with different sets of information.


public class Student {
	String Name;
	int Age;
	int Rollno;
	Double Marks;
	
	Student(){
		Name="Unknown";
		Age=0;
		Rollno=0;
		Marks=0.0;
		
	}
	
	Student(String Name){
		this.Name=Name;
	}
	Student(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}
	Student(String Name,int Age,int Rollno,double Marks){
		this.Name=Name;
		this.Age=Age;
		this.Rollno=Rollno;
		this.Marks=Marks;
	}
	void Display() {
		System.out.println("Student Name :"+Name);
		System.out.println("Student Age :"+Age);
		System.out.println("Student Roll Number :"+Rollno);
		System.out.println("Student Marks :"+Marks);
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Ben");
		Student s3=new Student("Gwen",20);
		Student s4=new Student("Kevin",28,11,70);
		System.out.println("----- Student 1 Details-----");
		s1.Display();
		System.out.println("----- Student 2 Details-----");
		s2.Display();
		System.out.println("----- Student 3 Details -----");
		s3.Display();
		System.out.println("----- Student 4 Details -----");
		s4.Display();
		
	}

}



