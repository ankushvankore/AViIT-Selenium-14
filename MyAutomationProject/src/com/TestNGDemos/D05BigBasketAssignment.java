package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05BigBasketAssignment {
	WebDriver driver;
	@Test(priority = 1, groups = "Breakfast")
	public void clickExoticFruits() {
		driver.findElement(By.partialLinkText("Exotic")).click();
	}
	
	@Test(priority = 2, groups = "Breakfast")
	public void clickTea() {
		driver.findElement(By.partialLinkText("Tea")).click();
	}
	
	@Test(priority = 3, groups = "MilkProducts")
	public void clickGhee() {
		driver.findElement(By.partialLinkText("Ghee")).click();
	}
	
	@Test(priority = 4, groups = "MilkProducts")
	public void clickNandini() {
		driver.findElement(By.partialLinkText("Nandini")).click();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.bigbasket.com/?nc=logo");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest (alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
