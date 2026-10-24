package com.java.Assignment02;

import java.util.Scanner;

public class EmployeeSalary {
	double  CalculateSalary(double salary , double allowance) {
		double GrossSalary= salary + allowance;
		return GrossSalary;
	}
	double CalculateNetSalary(double GrossSalary,double deductions) {
		double NetSalary=GrossSalary - deductions;
		return NetSalary;
	}
	void DisplayDetails(String name,double GrossSalary,double NetSalary) {
		System.out.println("EmployeeName : " + name);
		System.out.println("GrossSalary is : " + GrossSalary);
		System.out.println("NetSalary is : " + NetSalary);
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name :" );
		String name =sc.nextLine();
		System.out.println("Enter salary :" );
		double salary =sc.nextDouble();
		System.out.println("Enter Allowance :" );
		double allowance =sc.nextDouble();
		System.out.println("Enter Deductions :" );
		double deductions =sc.nextDouble();
		sc.close();
		
		EmployeeSalary obj=new EmployeeSalary();
		double GrossSalary = obj.CalculateSalary(salary,allowance);
		double NetSalary = obj.CalculateNetSalary(GrossSalary,deductions);
		obj.DisplayDetails(name, GrossSalary, NetSalary);
		

	}

}


//1.Scenario: A company wants to calculate the monthly salary of its employees, including
//allowances and deductions.
//
//Requirements:
//
//1. Create a class EmployeeSalary.
//2. Create a method calculateSalary() that accepts basic salary and allowance and
//returns the gross salary.
//3. Create a method calculateNetSalary() that accepts gross salary and deductions
//and returns the net salary.
//4. Create a method displayDetails() to display the employee name, gross salary, and
//net salary.
//5. Call all methods from main() without using a constructor.
//
//Sample input: Basic salary = ₹25,000, Allowance = ₹5,000, Deductions = ₹2,000.
//
//Expected output:
//
//Gross Salary: 30000.0
//Net Salary: 28000.0