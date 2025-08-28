package com.LanguageBasics;

import java.util.Scanner;

public class D04CalulateAddition {

	public static void main(String[] args) {
		int no1, no2, sum;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter 1st No: ");
		no1 = scn.nextInt();
		System.out.println("Enter 2nd No: ");
		no2 = scn.nextInt();
		
		sum = no1 + no2;
		
		System.out.println("Addition: " + sum);
	}

}
