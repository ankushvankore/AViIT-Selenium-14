package com.FunctionDemos;

import java.util.Scanner;

public class D04MultipleReturnStatement {

	public static int findMax(int n1, int n2)
	{
		if(n1 > n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	}
	
	/*
	 Points to be noted about return statement
	 1. return statement terminates the function 
	 2. It returns single value to the calling function, but you may have multiple return statements
	 3. It transfers the control from called function to calling function
	 */
	
	public static void main(String[] args) {
		int no1, no2, sum;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter 1st No: ");
		no1 = scn.nextInt();
		System.out.println("Enter 2nd No: ");
		no2 = scn.nextInt();

		int max = findMax(no1, no2);
		System.out.println("Maximum: " + max);
	}

}
