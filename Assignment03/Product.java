package com.java.Assignment03;

public class Product {
	int productId;
	String productName;
	double price;
	
	Product(){
		productId=0;
		productName="unknown";
		price=0000.0;
	}
	Product(int productId,String productName){
		this.productId=productId;
		this.productName=productName;
	}
	Product(int productId,String productName,double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	void display() {
		System.out.println("product Id :" + productId);
		System.out.println("product Name :" + productName);
		System.out.println("product price :" + price);
	}

	
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product(11,"Electronics");
		Product p3=new Product(15,"Furnitures",30000);
		p1.display();
		p2.display();
		p3.display();
		

	}

}

//4.Scenario: An online shopping application allows products to be created with different levels of 
//information. 
//Requirements: 
//1. Create a class Product with productId, productName, and price. 
//2. Create three constructors: 
//○ A no-argument constructor. 
//○ A constructor accepting productId and productName. 
//○ A constructor accepting productId, productName, and price. 
//3. Initialize appropriate values in each constructor. 
//4. Create three objects, each using a different constructor. 
//5. Display all product details. 
//Task: Demonstrate how Java selects the correct constructor based on the arguments supplied. 
