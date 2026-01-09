package com.WebTests;

import org.testng.annotations.Test;

public class D09InvococationCount {
	@Test(invocationCount = 5)
	public void myTest() {
		System.out.println("My Test!!!");
	}
	
	
}
