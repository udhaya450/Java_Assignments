package com.java.Assignment04_oopsContinue;

//4. A company has different employee types: Developer and Manager. Both share common employee details, but each has a different responsibility description.
//
//Write a Java program using inheritance and method overriding to display the responsibilities of each employee type.

public class EmpDetail {
	
	String Name;
	int ID;
	String Designation;
	
	EmpDetail(String Name,int ID,String Designation ){
		this.Name=Name;
		this.ID=ID;
		this.Designation=Designation;
	}
	void Display() {
		System.out.println("Employee Name : "+Name);
		System.out.println("Employee ID : "+ID);
		System.out.println("Working Designation : "+Designation);
	}
	
	void work() {
		System.out.println("Employee Works at Company");
	}
	
	public static void main(String[] args) {
		EmpDetail e=new EmpDetail("Will",301,"Engineer");
		e.Display();
		e.work();
		System.out.println();
	    Developer1 d=new Developer1("Smith",302,"JAVA Developer");
	    d.Display();
	    d.work();
	    System.out.println();
	    Manager1 m=new Manager1("Peter",303,"Project Manager");
	    m.Display();
	    m.work();
	    System.out.println();
	    Tester t=new Tester("Tom",304,"Software Tester");
	    t.Display();
	    t.work();
		
	}
	
}
class Developer1 extends EmpDetail{ 
	    Developer1(String Name,int ID,String Designation){
			super(Name,ID,Designation);
		}
		@Override
		void work() {
			System.out.println("Developer creates Websites and Apps");
			
		}
		
	}

class Manager1 extends EmpDetail{
	Manager1(String Name,int ID,String Designation){
		super(Name,ID,Designation);
	}
	@Override
	void work() {
		System.out.println("Manager Administrates the company");
		
	}
}
class Tester extends EmpDetail{
	Tester(String Name,int ID,String Designation){
		super(Name,ID,Designation);
	}
	@Override
	void work() {
		System.out.println("Tester Fixes the Bugs");
		
	}
}

