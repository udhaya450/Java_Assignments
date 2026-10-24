package com.java.Assignment02;

import java.util.Scanner;

public class ShoppingCart {
	
	double calculateTotal(double p1,double p2,double p3) {
	
		double TotalPrice= p1+p2+p3;
		return  TotalPrice;
	}
	double calculateDiscount(double TotalPrice, String Membership_Type ) {
		double Discount=0;
		
		if(Membership_Type.equals("Gold") ){
			 Discount= TotalPrice * (20.0 / 100);
		}
		else if(Membership_Type.equals("Silver")) {
			 Discount = TotalPrice * (10.0/100);
		}
		else if(Membership_Type.equals("Regular")) {
			Discount = TotalPrice * (5.0/100);
		}
		else {
			System.out.println( "No Discounts");
		}
		
		return  Discount ;
	}
	double calculateFinalAmount(double Totalprice,double Discount) {
		double FinalAmount=Totalprice-Discount;
		return FinalAmount;
	}

	public static void main(String[] args) {
		
		ShoppingCart obj=new ShoppingCart();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Price 1 ;");
		double p1=sc.nextDouble();
		System.out.println("Enter Price 2 ;");
		double p2=sc.nextDouble();
		System.out.println("Enter Price 3 ;");
		double p3=sc.nextDouble();
		
		double TotalPrice=obj.calculateTotal(p1,p2,p3);
		System.out.println("enetr membership type:");
		sc.nextLine();
		String Membership_Type=sc.nextLine();
		double Discount=obj.calculateDiscount(TotalPrice,Membership_Type);
		double FinalAmount=obj.calculateFinalAmount(TotalPrice, Discount);
		
		System.out.println("Total Price: " + TotalPrice);
		System.out.println("Discount: " + Discount);
		System.out.println("Final Amount: " + FinalAmount);
		
		sc.close();
		
	}
}



//3.Scenario: An online shopping application calculates the final bill based on the purchase
//amount and membership type.
//Requirements:
//1. Create a class ShoppingCart.
//2. Create a method calculateTotal() that accepts the prices of three products and
//returns the total.
//3. Create a method calculateDiscount() that accepts the total and membership type.
//Apply:
//○ Gold: 20% discount
//○ Silver: 10% discount
//○ Regular: 5% discount
//4. Create a method calculateFinalAmount() that returns the amount after discount.
//5. Create a method to display the total, discount, and final amount.
//Sample input: ₹2,000, ₹1,500, ₹500; membership = Gold.
//Expected output:
//Total Amount: 4000.0
//Discount: 800.0
//Final Amount: 3200.0