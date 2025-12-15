package com.Assignments;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class ForAssertion {
	@Test(priority = 1)
	public void assertPassDemo() {
		System.out.println("------------ Test 1-----------------");
		System.out.println("Test starts");
		
		Assert.assertTrue(true);
		
		System.out.println("Test Ends");
	}
	@Test(priority = 2)
	public void assertFailDemo() {
		System.out.println("------------ Test 2-----------------");
		System.out.println("Test starts");
		
		Assert.assertTrue(false);
		
		System.out.println("Test Ends");
	}
	
	@Test (priority = 3)
	public void softAssertionPassDemo1() {
		System.out.println("------------ Test 3 -----------------");
		System.out.println("Test starts");
		
		SoftAssert a1 = new SoftAssert();
		a1.assertTrue(true);
		System.out.println("Test Ends");
	}
	
	@Test (priority = 4)
	public void softAssertionFailDemo1() {
		System.out.println("------------ Test 4 -----------------");
		System.out.println("Test starts");
		
		SoftAssert a1 = new SoftAssert();
		a1.assertTrue(false);
		System.out.println("Test Ends");
		
		a1.assertAll();
	}
}
