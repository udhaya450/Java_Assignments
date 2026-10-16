package com.java.Assignment01;
	
import java.util.Scanner;

public class LocalVariable {
	void calculateBill(double units) {
		double bill = 0;
		if(units < 0){
			System.out.println("Invalid Unit Input");
			return;
		}else if(units <= 100) {
			bill = units * 2.0;
		}else if(units <= 200) {
			bill = (100 * 2.0) + ((units - 100) * 3.0);
		}else {
			bill = (100 * 2.0) + (100 * 3.0)+ ((units - 200) * 5.0);
		}
			
		System.out.println("Electricity Units: " + units); 
		System.out.println("Total Electricity Bill: ₹" + bill);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalVariable obj = new LocalVariable();
		System.out.print("Enter electricity units: ");
		double units = sc.nextDouble();
		obj.calculateBill(units);
		sc.close();

	}

}