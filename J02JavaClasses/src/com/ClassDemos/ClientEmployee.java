package com.ClassDemos;

public class ClientEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee.setCompany("Infosys");
		e1.displayData();
		//double sal = e1.calculateSalary();
		//System.out.println("Net Salary   : " + sal);
		System.out.println("Net Salary   : " + e1.calculateSalary());
		
		System.out.println("====================================");
		
		Employee e2 = new Employee(123, "Trupti", "Female", 55000);
		//e2.setCompany("Infosys");
		e2.displayData();
		System.out.println("Net Salary   : " + e2.calculateSalary());
		
		Employee e3 = new Employee();
		e3.displayData();
		
		e3.trial();
	}

}
 