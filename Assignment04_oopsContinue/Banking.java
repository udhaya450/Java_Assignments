package com.java.Assignment04_oopsContinue;

//3. A banking application stores an account holder's name and balance. The balance should not be modified directly from outside the class, and withdrawals must not exceed the available balance.
//
//Implement encapsulation using private variables, getters, setters where appropriate, and a withdrawal method.



public class Banking {
	private String Name;
	private double balance;
	
	public String getname() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}

	public void Withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Succesfull Withdrwal");
		}
		else {
			System.out.println("invalid Amount");
		}
	}
	
	double checkbalance() {
		return balance;
	}
	public static void main(String[] args) {
		Banking b=new Banking();
		b.setName("Udhaya");
		b.setbalance(10000);
	    System.out.println("Available Balance : " + b.balance);
		b.Withdraw(3000);
		b.Withdraw(2000);
		System.out.println("Current Balance :" + b.checkbalance());
		

	}

}


