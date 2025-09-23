package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D01ListDemo {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>();

		students.add("Amita");
		students.add("Trupti");
		students.add("Sharvari");
		students.add("Sheetal");
		students.add("Amita");
		
		System.out.println("Total Students: " + students.size());
		
		//System.out.println(students.get(0));
		//System.out.println(students.get(1));
		
		//for(int i = 0; i < students.size(); i++)
			//System.out.println(students.get(i));
		
		for(String s : students)
			System.out.println(s);
		
		
	}

}
