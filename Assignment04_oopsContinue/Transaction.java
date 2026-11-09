package com.java.Assignment04_oopsContinue;

//5. An online payment application supports UPI and credit card payments. Both payment methods must implement a common payment operation, but their processing logic differs.

//Create an abstract class named Payment with an abstract method processPayment(). Implement it in UPIPayment and CreditCardPayment classes and demonstrate runtime polymorphism.

 abstract class Payment {
	abstract void processPayment() ;
	
	void stop() {
		System.out.println("Succcesfull Transaction");
	}
	
}	

class UPIPayment extends Payment{
	void processPayment() {
		System.out.println("Payment Through UPI");
		System.out.println("Scan the QR Code");
	}
}

class CreditCardpayment extends Payment{
	void processPayment() {
		System.out.println("Payment Through Credit Card");
		System.out.println("Enter your Pin");
	}
}

public class Transaction {
    	
    public static void main(String[] args) {
		UPIPayment u=new UPIPayment();
		CreditCardpayment c=new CreditCardpayment();
		u.processPayment();
		u.stop();
		System.out.println();
		c.processPayment();
		c.stop();
		

	}
}


