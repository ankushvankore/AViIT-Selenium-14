package com.ClassDemos;

public class MyDate {
	//Data Abstraction /Data Members
	private int day;
	private String month;
	private int year;

	//Behavioral Abstraction / Member Functions
	
	public MyDate() 				//Plain / Default / No Parameter Constructor
	{
		this.day = 1;
		this.month = "Jan";
		this.year = 2025;
		System.out.println("Plain Constructor Called!!!");
	}
	public MyDate(int d, String m, int y)	//Parameterized Constructor
	{
		day = d;
		month = m;
		year = y;
		System.out.println("Parameterized Constructor Called!!!");
	}
	
	public void setDay(int d)		//Setter function / Mutator function
	{
		this.day = d;
	}
	public int getDay()				//Getter function / Accessor function
	{
		return day;
	}
	
	public void displayDate()		//Facilitator function
	{
		System.out.println("Date is: " + this.day + "-" + this.month + "-" + this.year);
	}
}
