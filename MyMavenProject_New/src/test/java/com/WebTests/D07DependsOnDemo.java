package com.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D07DependsOnDemo {
	@Test
	public void login() {
		System.out.println("Login Test");

		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout Test");
	}
}
