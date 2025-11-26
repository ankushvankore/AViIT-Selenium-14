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
	@Test(priority = 1)
	public void clickExoticFruits() {
		driver.findElement(By.partialLinkText("Exotic")).click();
	}
	
	@Test(priority = 2)
	public void clickTea() {
		driver.findElement(By.partialLinkText("Tea")).click();
	}
	
	@Test(priority = 3)
	public void clickGhee() {
		driver.findElement(By.partialLinkText("Ghee")).click();
	}
	
	@Test(priority = 4)
	public void clickNandini() {
		driver.findElement(By.partialLinkText("Nandini")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.bigbasket.com/?nc=logo");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
