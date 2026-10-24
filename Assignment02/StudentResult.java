package com.java.Assignment02;

import java.util.Scanner;

public class StudentResult {
	double calculateTotal(double Tam,double Eng,double Math,double Sci,double His) {
		double Total=Tam+Eng+Math+Sci+His;
		return Total;
	}
	double calculateAverage(double Total) {
		double Average=Total/5;
		return Average;
	}
	String calculateGrade(double Average) {
		if(Average>=90) {
			return " A";
		}
		else if(Average>=75){
			return " B";
		}
		else if(Average>=60) {
			return " C";
		}
		else  {
			return " Fail";
		}
	}
	void displayResult(double Total, double Average, String Grade) {
		System.out.println("Your Total Marks : "+ Total);
		System.out.println("Average :" + Average);
		System.out.println("Your Grade: "+ Grade);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double Tam=sc.nextDouble();
		double Eng=sc.nextDouble();
		double Math=sc.nextDouble();
		double Sci=sc.nextDouble();
		double His=sc.nextDouble();
		sc.close();
		
		StudentResult obj=new StudentResult();
		double Total=obj.calculateTotal(Tam,Eng,Math,Sci,His);
		double Average=obj.calculateAverage(Total);
		String Grade=obj.calculateGrade( Average);
		obj.displayResult( Total, Average,Grade);
		
		

	}

}

//2.Scenario: A college wants to calculate students' results based on five subject marks. 
//Requirements: 
//1. Create a class StudentResult. 
//2. Create a method calculateTotal() that accepts five subject marks and returns the 
//total. 
//3. Create a method calculateAverage() that accepts the total and returns the average. 
//4. Create a method calculateGrade() that accepts the average and returns a grade: 
//○ 90 and above: A 
//○ 75–89: B 
//○ 50–74: C 
//○ Below 50: Fail 
//5. Create a method to display the total, average, and grade. 
//Sample input: 85, 78, 92, 88, 77. 
//Expected output: 
//Total: 420 
//Average: 84.0 
//Grade: B