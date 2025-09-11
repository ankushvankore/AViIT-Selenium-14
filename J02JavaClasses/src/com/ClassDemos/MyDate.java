package com.ClassDemos;

public class MyDate {
	//Data Abstraction /Data Members
	private int day;
	private String month;
	private int year;

	//Behavioral Abstraction / Member Functions
	
	public MyDate() {
		day = 1;
		month = "Jan";
		year = 2025;
		System.out.println("Plain Constructor Called!!!");
	}
	public MyDate(int d, String m, int y)
	{
		day = d;
		month = m;
		year = y;
		System.out.println("Parameterized Constructor Called!!!");
	}
	
	public void setDay(int d)		//Setter function / Mutator function
	{
		day = d;
	}
	public int getDay()				//Getter function / Accessor function
	{
		return day;
	}
	
	public void displayDate()		//Facilitator function
	{
		System.out.println("Date is: " + day + "-" + month + "-" + year);
	}
}
