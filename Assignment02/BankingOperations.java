  package com.java.Assignment02;

import java.util.Scanner;

public class BankingOperations {
	double Deposit(double Balance,double depositAmount){
		double Updated_Balance =Balance + depositAmount;
		return Updated_Balance; 
	}
	double Withdraw(double Balance,double WithdrawlAmount) {
		if(WithdrawlAmount>Balance) {
			System.out.println("Invalid Withdrawal");
			return 0.0;
		}
		double Updated_Amount=Balance-WithdrawlAmount;
		return Updated_Amount;
	
	}
	double Checkbalance(double Updated_Amount) {
		System.out.println("Your balance is -> ");
		return Updated_Amount;
	}
	
	void displayTransactionSummary(double Balance,double DepositAmount,double WithDrawlAmount,double Updated_Amount) {
		System.out.println("Initial Balance : "+ Balance);
		System.out.println("Deposit Amount : "+ DepositAmount);
		System.out.println("WithDrawl Amount : "+ WithDrawlAmount);
		System.out.println("Final Balance : "+ Updated_Amount);
	}

	public static void main(String[] args) {
		BankingOperations obj=new BankingOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Initial Balance : ");
		double Balance=sc.nextDouble();		
		System.out.println("Enter Deposit amount : ");
		double DepositAmount=sc.nextDouble();
		System.out.println("Enter WithDrwalAmount: ");
		double WithdrawlAmount=sc.nextDouble();	
		
		double Updated_Amount =  obj.Deposit(Balance, DepositAmount);
		double AmountAfterW =  obj.Withdraw( Updated_Amount,WithdrawlAmount );
		//obj.Checkbalance(AmountAfterW);
		System.out.println(obj.Checkbalance(AmountAfterW));
		obj.displayTransactionSummary(Balance, DepositAmount, WithdrawlAmount, AmountAfterW);
		sc.close();
			
		}

	

}



//5.Scenario: A bank needs a simple application to perform deposits, withdrawals, and balance 
//checks. 
//Requirements: 
//1. Create a class BankingOperations. 
//2. Create a method deposit() that accepts the current balance and deposit amount and 
//returns the updated balance. 
//3. Create a method withdraw() that accepts the current balance and withdrawal amount. 
//If sufficient funds are unavailable, display an appropriate message. 
//4. Create a method checkBalance() that accepts the current balance and displays it. 
//5. Create a method displayTransactionSummary() that displays the deposit amount, 
//withdrawal amount, and final balance. 
//6. Call all methods from main() without using constructors. 
//Sample input: 
//● Initial balance: ₹5,000 
//● Deposit: ₹2,000 
//● Withdrawal: ₹1,500 
//Expected output: 
//Initial Balance: 5000.0 
//Deposited: 2000.0 
//Withdrawn: 1500.0 
//Final Balance: 5500.0