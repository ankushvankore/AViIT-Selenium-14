package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D10POM_Client {
	WebDriver driver;
	RediffUtility r1;
	@Test
	public void createUser() {
		r1.setFullName("Amita Charpe");
		r1.setRediffId("amitacharpe");
		r1.setPassword("Amita@123");
		r1.setBirthDate("01", "APR", "2000");
	}
	
	@Test
	public void createUser2() {
		r1.setFullName("Trupti Killedar");
		r1.setRediffId("truptikilledar");
		r1.setPassword("Trupti!23");
		r1.setBirthDate("31", "JAN", "2002");
	}
	
	@BeforeMethod
	public void refreshPage() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}
	

}
