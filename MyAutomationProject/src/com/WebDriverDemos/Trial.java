package com.WebDriverDemos;

public class Trial {

	public static void main(String[] args) {
		int no1 = 10;
		double val = no1;		//Implicitly no1 get converted into double
		System.out.println("val: " + val);
		
		double pi = 3.142;
		int no = (int)pi;		//Explicit Casting - done forcefully, may lost some data
		System.out.println("no: " + no);
		
		double no2 = 5;
		int no3 = (int)no2;
		System.out.println("no3: " + no3);
	}

}
