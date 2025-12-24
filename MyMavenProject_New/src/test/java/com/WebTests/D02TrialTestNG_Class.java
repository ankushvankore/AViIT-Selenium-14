package com.WebTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D02TrialTestNG_Class {
	@Test
	public void testGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		System.out.println("Title: "  + driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"));
		
		driver.close();
	}
}
