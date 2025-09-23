package com.CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class D03SetDemo {

	public static void main(String[] args) {
		Set<String>students = new HashSet<>();
		
		students.add("Amita");
		students.add("Trupti");
		students.add("Sharvari");
		students.add("Sheetal");
		students.add("Amita");
		
		System.out.println("Total no of Elements: " + students.size());
		
		for(String s : students)
			System.out.println(s);
	}

}
