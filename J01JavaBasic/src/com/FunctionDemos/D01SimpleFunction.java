package com.FunctionDemos;

public class D01SimpleFunction {

	/*
	 public static <return type>name(arguments){
	 	body of function;
	 }
	 */
	//Function Body / Definition
	public static void sayHello()			//Called method
	{
		System.out.println("Hello Friends");
	}
	public void demoFunction()
	{
		System.out.println("this is demo function");
	}
	public static void main(String[] args) //Calling method
	{
		//Function call
		sayHello();
		sayHello();
		sayHello();
		
		D01SimpleFunction d1 = new D01SimpleFunction();
		d1.demoFunction();

	}

}
