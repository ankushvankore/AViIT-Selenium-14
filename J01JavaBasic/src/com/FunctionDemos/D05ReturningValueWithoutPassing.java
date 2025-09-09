package com.FunctionDemos;

import java.util.Scanner;

public class D05ReturningValueWithoutPassing {

	public static int calculateSqure()
	{
		int no1, ans;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter 1st No: ");
		no1 = scn.nextInt();
		
		//ans = no1 * no1;
		//return ans;
		return (no1 * no1);
	}
	
	public static void main(String[] args) {
		int a = calculateSqure();
		System.out.println("Squre: " + a);

	}

}
