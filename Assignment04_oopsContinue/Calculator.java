package com.java.Assignment04_oopsContinue;

//2.A calculator application performs addition for two integers and two decimal numbers. Another application requires different employee types to calculate bonuses differently.
//
//Write a Java program demonstrating method overloading and method overriding.

// Method overloading

public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	double add(double a, double b){
		return a+b;
	}
	
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println("Integer Addition : " + obj.add(10, 20));
		System.out.println("Decimal Addition : " + obj.add(12.4, 25.3));
	
		
		Employee e1=new Employee();
		System.out.println("Employee bonus :"+ e1.calculateBonus(30000) );
		Employee e2=new Manager();
		System.out.println("Manager Bonus : "+ e2.calculateBonus(200000));
		Employee e3=new Developer();
		System.out.println("developer Bonus : "+ e3.calculateBonus(50000));
		Employee e4=new HR();
		System.out.println("HR Bonus : "+ e4.calculateBonus(100000));
		
	}
}
// Method Overloading	
class Employee{
	double calculateBonus(double salary) {
		return salary * 0.05;
	}
}
class Manager extends Employee{
	@Override
	double calculateBonus(double salary) {
		return salary * 0.20;
	}
}
class Developer extends Employee{
	@Override
	double calculateBonus(double salary) {
		return salary * 0.10;
	}
}
class HR extends Employee{
	@Override
	double calculateBonus(double salary){
		return salary * 0.15;
	}
}

	
	