package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D02ListDemo2 {

	public static void main(String[] args) {
		List<Integer>nos = new ArrayList<>();	//Integer is WRAPER CLASS for int data type
		nos.add(10);
		nos.add(33);
		nos.add(54);
		
		for(int n : nos)
			System.out.println(n);
	}

}
