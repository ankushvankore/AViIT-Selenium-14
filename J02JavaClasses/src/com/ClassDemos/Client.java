package com.ClassDemos;

public class Client {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setDay(1);
		d1.displayDate();
		
		int d = d1.getDay();
		System.out.println("Day: " + d);
		
		MyDate d2 = new MyDate();
		d2.displayDate();
		
		MyDate d3 = new MyDate(1, "April", 2002);
		d3.displayDate();
		
		MyDate d4 = new MyDate(31, "Jan", 2003);
		d4.displayDate();
		
		MyDate d5 = new MyDate();
	}

}
