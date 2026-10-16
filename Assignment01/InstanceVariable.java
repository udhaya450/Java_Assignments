package com.java.Assignment01;

public class InstanceVariable {
	String name;
	int roll_no;
	void StudentsList(String SName, int SRollNo) {
		name = SName;
		roll_no = SRollNo;
		
		System.out.println("Student Name : " + name);
		System.out.println("Student Roll Number : " + roll_no);
		
	}
	
	public static void main(String args[]) {
		InstanceVariable s1 = new InstanceVariable();
		InstanceVariable s2 = new InstanceVariable();
		InstanceVariable s3 = new InstanceVariable();
		
		s1.StudentsList("udhaya", 101);
		s2.StudentsList("Ragav", 105);
		s3.StudentsList("Afrith", 110);
	}

}