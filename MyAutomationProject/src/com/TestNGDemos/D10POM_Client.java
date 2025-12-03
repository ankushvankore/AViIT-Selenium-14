package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client {
	public static WebDriver driverClient;
	RediffUtility r1;
	@Test
	public void createUser() {
		r1.setFullName("Amita Charpe");
		r1.setRediffId("amitacharpe");
		r1.setPassword("Amita@123");
		r1.setBirthDate("01", "APR", "2000");
	}

	@BeforeTest
	public void beforeTest() {
		driverClient = new EdgeDriver();
		driverClient.manage().window().maximize();
		driverClient.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driverClient.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility();
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}
	

}
