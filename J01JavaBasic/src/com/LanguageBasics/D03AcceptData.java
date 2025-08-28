package com.LanguageBasics;

import java.util.Scanner;

public class D03AcceptData {
	public static void main(String[] args) {
		int no1;
		double avg;
		String company;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		no1 = scn.nextInt();		//To accept an integer value
		
		System.out.println("Number: " + no1);
	}
}
