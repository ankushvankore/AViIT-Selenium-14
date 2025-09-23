package com.InheritanceDemos;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Employee emp;					//Generic Reference
		Employee e2 = new Employee(123, "Sarvesh", "Male", 50000);	//Object
		Manager m1 = new Manager(234, "Rajesh", "Male", 50000, 50000, 0.05);
		
		//emp = m1;
		//emp = new Manager(789, "Tanuja", "Female", 50000, 50000, 0.05);
		
		emp = e2;
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		System.out.println("===================================");
		
		emp = m1;
		emp.displayData();
		
		final double pi = 3.142;
		//pi = 88;
		
		/*final keyword can be used in 3 different ways.
		Used with variable, variable will become constant, you can not change the value of variable.
		Used with class, class will become sealed. Can’t inherited.
		Used with method, method cannot be overridden.
*/
	}

}
