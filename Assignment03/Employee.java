package com.java.Assignment03;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	
	Employee(int employeeId,String employeeName,double salary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	double calculateAnnualSalary(){
		double AnnualSalary=salary*12;
		return AnnualSalary;
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee (101,"Ram",30000);
	    Employee e2=new Employee(102,"Krish",40000);
		Employee e3=new Employee(103,"sita",50000);
		
		System.out.println(e1.employeeName + " Annual salary : " + e1.calculateAnnualSalary());
		System.out.println(e2.employeeName + " Annual salary : " + e2.calculateAnnualSalary());
		System.out.println(e3.employeeName + " Annual salary : " + e3.calculateAnnualSalary());
		
		
		
		

	}

}

//3.Scenario: A company needs to store different employee details when each employee joins. 
//Requirements: 
//1. Create a class Employee with employeeId, employeeName, and salary. 
//2. Create a parameterized constructor that accepts all three values. 
//3. Create a method calculateAnnualSalary() that calculates annual salary. 
//4. Create three employee objects with different details and display their annual salaries. 
//Sample input: 
//● Employee 1: 101, "Arun", 25000 
//● Employee 2: 102, "Divya", 35000 
//● Employee 3: 103, "Kumar", 40000 
//Task: Calculate and display the annual salary for each employee. 
