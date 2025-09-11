package com.ArrayDemos;

import java.util.Arrays;
import java.util.Collections;

public class D03ArrayInitialization2 {

	public static void main(String[] args) {
		//int[]marks = new int[] {85, 77, 99, 66, 73};
		int[]marks = {85, 77, 99, 66, 73, 25, 45, 68, 71, 56};
		
		for(int i = 0; i < marks.length; i++)
			System.out.println(marks[i]);
		
		Arrays.sort(marks);
		
		System.out.println("Array After sorting...");
		
		/*for(int i = 0; i < marks.length; i++)
		{
			System.out.println(marks[i]);
		}*/
		
		//for each / enhanced for loop
		//1. It is read only loop
		//2. It is forward-only loop
		//3. The variable is just the copy of element from collection
		
		for(int m : marks)
		{
			System.out.println(m);
		}
		
		String[] name = {"Amita", "Tripti", "Ankush"};
		
		Collections.reverse(Arrays.asList(name));
		
		for(String n : name)
		{
			System.out.println(n);
		}
		
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		int arr3[] = {1, 2, 3};
		
	}

}
