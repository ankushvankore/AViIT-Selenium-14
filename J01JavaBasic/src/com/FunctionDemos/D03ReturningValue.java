package com.FunctionDemos;

public class D03ReturningValue {

	public static double calculateArea(int rd) {
		double area = 3.142 * rd * rd;

		return area;
	}
	
	/*
	 Points to be noted about return statement
	 1. return statement terminates the function 
	 2. It returns single value to the calling function, but you may have multiple return statements
	 3. It transfers the control from called function to calling function
	 */

	public static void main(String[] args) {
		double ar = calculateArea(5);
		System.out.println("Area of Circle: " + ar);
	}

}
