package com.java.Assignment02;

import java.util.Scanner;

public class ElectricityBill {
	
	double calculateBill(double units) {
		double Bill=0;
		if (units <= 100) {
		    Bill = units * 2.0;
		}
		else if (units <= 200) {
		    Bill = (100 * 2.0) + ((units - 100) * 3.0);
		}
		else {
		    Bill = (100 * 2.0) + (100 * 3.0)
		           + ((units - 200) * 5.0);
		}
		
		
		return Bill;
	}
	double addFixedcharge(double Bill) {
		double FinalBill=0;
		double FixedCharge=50.0;
		FinalBill=Bill+FixedCharge;
		return FinalBill;
	}
	String Display(double Bill,double FinalBill) {
		
		return "Your Energy Bill :" + Bill
		     + "\nyour Final Bill with Fixedcharge of 50 : " + FinalBill;
		
	}
	
	public static void main(String[] args) {
		ElectricityBill e=new ElectricityBill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Consumed Units :");
		double units=sc.nextDouble();
		double Bill=e.calculateBill(units);
		double FinalBill=e.addFixedcharge(Bill);
		System.out.println(e.Display(Bill,FinalBill));
		sc.close();
		
	}

}


//4.Scenario: An electricity board calculates a household bill based on units consumed. 
//Requirements: 
//1. Create a class ElectricityBill. 
//2. Create a method calculateBill() that accepts the number of units consumed and 
//returns the bill amount using these slabs: 
//○ First 100 units: ₹2 per unit 
//○ Next 100 units: ₹3 per unit 
//○ Above 200 units: ₹5 per unit 
//3. Apply the rates progressively. For example, 250 units means 100 units at ₹2, 100 units 
//at ₹3, and 50 units at ₹5. 
//4. Create a method addFixedCharge() that accepts the bill amount and adds a fixed 
//charge of ₹50. 
//5. Create a method to display the final bill. 
//Sample input: 250 units. 
//Expected output: 
//Energy Charge: 750.0 
//Fixed Charge: 50.0 
//Final Bill: 800.0 