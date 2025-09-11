package com.ArrayDemos;

public class D05StringDemos {

	public static void main(String[] args) {
		//String is class that represents collection of characters
		//String is 1D array of characters
		//String is FIRST CLASS OBJECT in Java
		
		String str1 = "Hello Friends";
		String str2 = "Hello friends";
		
		System.out.println(str1.charAt(3));
		if(str1.contains("Fri"))
			System.out.println("Yes it contains");
		else
			System.out.println("Not contains");
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both are equal ignoring case");
		else
			System.out.println("Both are not equal ignoring case");
		
		str2 = str2.replace("o", "O");
		System.out.println(str2);
		str2 = str2.replace("e", "E");
		System.out.println(str2);
	}

}
