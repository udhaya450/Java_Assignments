package com.java.Assignment01;

public class StaticVariable {
	String EmployeeName;
	static int employeeCount = 0;
	
	void EmployeeCounter(String name) {
		EmployeeName = name;
		employeeCount++;
		
		System.out.println("Employee Name : " + EmployeeName);
		System.out.println("Total Employees : " + employeeCount);
		
	}
	public static void main(String[] args) {
		StaticVariable e1 = new StaticVariable();
		StaticVariable e2 = new StaticVariable();
		StaticVariable e3 = new StaticVariable();
		
		e1.EmployeeCounter("Emma");
		e2.EmployeeCounter("Watson");
		e3.EmployeeCounter("EmmaStone");
		
		System.out.print("Final Employee Count : "+StaticVariable.employeeCount);
	}

}