package com.java.Assignment03;

public class BankAccount {
	double accountNumber;
	String holderName;
	double balance;
	
	BankAccount(double accountNumber,String holderName,double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	void displayAccount() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder Name :"+holderName);
		System.out.println("Available Balance :"+balance);
	}

	public static void main(String[] args) {
		BankAccount obj1=new BankAccount(10005,"Udhaya",40000);
		BankAccount obj2=new BankAccount(10006,"Jothi",50000);
		obj1.displayAccount();
		obj2.displayAccount();
		
	}

}

//2.Scenario: A bank automatically creates a savings account with predefined initial details. 
//Requirements: 
//1. Create a class BankAccount with accountNumber, holderName, and balance. 
//2. Create a no-argument constructor that initializes them to 1001, "Priya", and 5000.0. 
//3. Create a method displayAccount() to display the details. 
//4. Create two objects and display their details. 
//Task: Explain how the no-argument constructor initializes each object.