package com.WebDriverDemos;

import java.util.Random;

public class RandomNoDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(10);	//Will return any random no in the range of 0 to 9
		System.out.println(n);
		
		System.out.println("n");
	}

}
