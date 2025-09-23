package com.AbstractDemo;

public class Client {

	public static void main(String[] args) {
		//Shape s1 = new Shape();
		Shape s1 = new Circle(5);
		s1.calculateArea();
		s1.trialMethod();
		
		Rectangle r1 = new Rectangle(5, 6);
		r1.calculateArea();
		r1.trialMethod();
		
		r1.print();
		
		//PrintInfo p1 = new PrintInfo();
		PrintInfo p1 = new Circle(5);
		p1.print();
		
		int no1 = 10, no2 = 5, ans;
		
		ans = no1 - no2;
		System.out.println(ans);
		
	}

}
