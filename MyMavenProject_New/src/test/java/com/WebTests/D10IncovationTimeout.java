package com.WebTests;

import org.testng.annotations.Test;

public class D10IncovationTimeout {
	@Test(invocationTimeOut = 3000)
	public void trialTest() throws InterruptedException {
		System.out.println("Test started!!!");
		
		Thread.sleep(2500);
		
		System.out.println("Test ends!!!");
	}
}
